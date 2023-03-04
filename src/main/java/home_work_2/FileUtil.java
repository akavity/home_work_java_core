package home_work_2;

import java.io.*;
import java.util.*;

public class FileUtil {

    public void copyFileInUpperCase(String source, String target) {
        StringBuilder textInUpperCase = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                textInUpperCase.append(line).append(" ");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(target))) {
            bufferedWriter.write(String.valueOf(textInUpperCase).toUpperCase());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> returnListOfLines(String source) {
        List<String> listOfLines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listOfLines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfLines;
    }

    public List<String> returnListOfWordsStatingFromVowel(String source) {
        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] listOfWords = String.valueOf(stringBuilder).split("(\\W+)");
        for (String word : listOfWords) {
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'y') {
                result.add(word);
            }
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'Y') {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> getListOfLines(String source) {
        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] listOfWords = String.valueOf(stringBuilder).split("(\\W+)");
        for (int i = 1; i < listOfWords.length; i++) {
            if (listOfWords[i].charAt(0) == listOfWords[i - 1].charAt(listOfWords[i].length() - 1)) {
                result.add(listOfWords[i - 1]);
                result.add(listOfWords[i]);
            }
        }
        return result;
    }

    public Map<Character, Integer> getLetterFrequency(String source) {
        Map<Character, Integer> words = new HashMap<>();
       StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        char[] symbols = String.valueOf(stringBuilder).toCharArray();
            //  String[] letters = String.valueOf(stringBuilder).toLowerCase().split("");
            //  int counter = 0;
//            char symbol2 = 'a';
//            while (symbol <= 'z') {
//                for (String str : letters) {
//                    if (symbol == str.charAt(0)) {
//                        words.put(symbol, ++counter);
//                    }
//                }
//                symbol++;
//                counter = 0;
//            }
            int counter = 0;
            for (char i = 'a'; i <= 'z'; i++) {
                for (char ch : symbols) {
                    if (i == ch) {
                        words.put(i, ++counter);
                    }
                }
                counter = 0;
            }
        return words;
    }


    public void sortingAFile(String source, String target) {
        List<Integer> sortNumbers = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(" ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] strings = String.valueOf(stringBuilder).split("(\\W+)");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(numbers);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(target))) {
         bufferedWriter.write(Arrays.toString(numbers));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
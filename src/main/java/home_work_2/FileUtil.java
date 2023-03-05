package home_work_2;

import java.io.*;
import java.util.*;

public class FileUtil {

    public void copyFileInUpperCase(String source, String target) {
        StringBuilder textInUpperCase = readLines(source, "\n");
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
        StringBuilder stringBuilder = readLines(source, "\n");
        String[] listOfWords = String.valueOf(stringBuilder).split("(\\W+)");
        for (String word : listOfWords) {
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'y'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'Y') {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> getListOfLines(String source) {
        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = readLines(source, " ");
        String[] listOfWords = String.valueOf(stringBuilder).split("(\\W+)");
        for (int i = 1; i < listOfWords.length; i++) {
            if (listOfWords[i].charAt(0) == listOfWords[i - 1].charAt(listOfWords[i - 1].length() - 1)) {
                result.add(listOfWords[i - 1] + " " + listOfWords[i]);
            }
        }
        return result;
    }

//    public List<String> getListOfTheLargestCombinationOfNumbers(String source) {
//        List<String> result = new ArrayList<>();
//
//        StringBuilder stringBuilder = new StringBuilder();
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
//            String line = null;
//            while((line = bufferedReader.readLine()) != null) {
//                String[] lineNumbers = line.split("(\\W+)");
//
//            }
//        }
//
//
//    }

    public Map<Character, Integer> getLetterFrequency(String source) {
        Map<Character, Integer> symbolsMap = new HashMap<>();
        StringBuilder stringBuilder = readLines(source, " ");
        char[] symbols = String.valueOf(stringBuilder).toLowerCase().toCharArray();
        int counter = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            for (char ch : symbols) {
                if (i == ch) {
                    symbolsMap.put(i, ++counter);
                }
            }
            counter = 0;
        }
        return symbolsMap;
    }

    public Map<String, Integer> sortTextByWords(String source) {
        Map<String, Integer> wordsMap = new HashMap<>();
        StringBuilder stringBuilder = readLines(source, " ");
        String[] words = String.valueOf(stringBuilder).split("(\\W+)");
        int count = 0;
        for (String word : words) {
            for (String word2 : words) {
                if (word.equals(word2)) {
                    wordsMap.put(word, ++count);
                }
            }
            count = 0;
        }
        return wordsMap;
    }

    public void sortingAFile(String source) {
        StringBuilder stringBuilder = readLines(source, " ");
        String[] strings = String.valueOf(stringBuilder).split("(\\W+)");
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(numbers);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(source + "_"))) {
            bufferedWriter.write(Arrays.toString(numbers));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Double> getStudentsAverageMarks(String source) {
        Map<String, Double> studentsAverageMarks = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] studentsAndMarks = line.split("(\\W+)");
                double averageMark = 0.0;
                for (int i = 1; i < studentsAndMarks.length; i++) {
                    averageMark += Integer.parseInt(studentsAndMarks[i]);
                }
                averageMark /= (studentsAndMarks.length - 1);
                studentsAverageMarks.put(studentsAndMarks[0], averageMark);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentsAverageMarks;
    }

    public StringBuilder readLines(String source, String regex) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append(regex);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder;
    }


}
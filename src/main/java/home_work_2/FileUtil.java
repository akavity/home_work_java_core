package home_work_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public void copyFileInUpperCase(String source, String target) {
        StringBuilder textInUpperCase = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                textInUpperCase.append(line.toUpperCase());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(target))) {
            bufferedWriter.write(String.valueOf(textInUpperCase));
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

    public List<String> returnListOfWordsStatingFromVowel(String source) throws IOException {
        List<String> result = new ArrayList<>();
        List<String> listOfWords;
        String str = Files.readString(Path.of(source));
        listOfWords = List.of(str.toLowerCase().split("(\\W+)"));
        for (String word : listOfWords) {
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'y') {
                result.add(word);
            }
        }
        return result;
    }






}
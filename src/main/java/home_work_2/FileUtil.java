package home_work_2;

import java.io.*;
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




}
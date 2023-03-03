package home_work_2;

import java.io.*;

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
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(target))) {
            bufferedWriter.write(String.valueOf(textInUpperCase));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
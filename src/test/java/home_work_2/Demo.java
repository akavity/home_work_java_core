package home_work_2;

import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        FileUtil test = new FileUtil();

        System.out.println("Task 01 \n");
        test.copyFileInUpperCase("resources/test1.txt", "resources/test2.txt");
        System.out.println("Open test2.txt \n");

        System.out.println("Task 02 \n");
        List<String> listWords = test.returnListOfLines("resources/test1.txt");
        for (String st : listWords) {
            System.out.println(st);
        }
        System.out.println(" ");

        System.out.println("Task 03 \n");
        List<String> listWords2 = test.returnListOfWordsStatingFromVowel("resources/test1.txt");
        for (String st : listWords2) {
            System.out.print(st + " ");
        }
        System.out.println("\n");

        System.out.println("Task 04 \n");
        List<String> listWords3 = test.getListOfLines("resources/test1.txt");
        for (String st : listWords3) {
            System.out.print(st + " ");
        }
        System.out.println("\n");

        System.out.println("Task 05 \n");
        System.out.println(" ");

        System.out.println("Task 06 \n");
        Map<Character, Integer> testMap = test.getLetterFrequency("resources/test3.txt");
        for (Map.Entry<Character, Integer> item : testMap.entrySet()) {
            System.out.printf("Char: %s   Amount: %s \n", item.getKey(), item.getValue());
        }
        System.out.println(" ");

        System.out.println("Task 07 \n");
        Map<String, Integer> testMap2 = test.sortTextByWords("resources/test3.txt");
        for (Map.Entry<String, Integer> item : testMap2.entrySet()) {
            System.out.printf("Word: %s   Amount: %s \n", item.getKey(), item.getValue());
        }
        System.out.println(" ");

        System.out.println("Task 08 \n");
        test.sortingAFile("resources/test8.txt");
        System.out.println("Open test8_.txt \n");

        System.out.println("Task 09 \n");
        Map<String, Double> testMap3 = test.getStudentsAverageMarks("resources/test9.txt");
        for (Map.Entry<String, Double> item : testMap3.entrySet()) {
            System.out.printf("LastName: %s   Average mark: %s \n", item.getKey(), item.getValue());
        }
        System.out.println(" ");

        System.out.println("Task 10 \n");
        test.changeModifier("resources/test10.txt", "public", "private");
        System.out.println("Open test10_.txt \n");
        System.out.println(" ");
    }
}

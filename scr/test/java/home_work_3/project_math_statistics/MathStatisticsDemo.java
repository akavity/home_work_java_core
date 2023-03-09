package home_work_3.project_math_statistics;

import java.util.ArrayList;
import java.util.List;

public class   MathStatisticsDemo {
    public static void main(String[] args) {
        Utility test = new Utility();
        List<Integer> list = new ArrayList<>(test.getListRandomNumbers(20, 100));

        System.out.println("New List with elements: ");
        System.out.println(list);

        System.out.print("Even numbers: ");
        System.out.println(test.getAmountOfEvenNumbers(list));

        System.out.print("Odd numbers: ");
        System.out.println(test.getAmountOfOddNumbers(list));

        System.out.print("Equals zero: ");
        System.out.println(test.getNumbersEqualsZero(list));

        System.out.print("Equals number 22: ");
        System.out.println(test.getNumbersEqualsNumber(list, 22));
        System.out.print("Equals number 44: ");
        System.out.println(test.getNumbersEqualsNumber(list, 44));
        System.out.print("Equals number 45: ");
        System.out.println(test.getNumbersEqualsNumber(list, 45));
        System.out.print("Equals number 46: ");
        System.out.println(test.getNumbersEqualsNumber(list, 46));
        System.out.print("Equals number 84: ");
        System.out.println(test.getNumbersEqualsNumber(list, 84));
        System.out.print("Equals number 75: ");
        System.out.println(test.getNumbersEqualsNumber(list, 75));
        System.out.print("Equals number 96: ");
        System.out.println(test.getNumbersEqualsNumber(list, 96));
    }
}

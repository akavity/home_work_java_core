package home_work_3.project_math_statistics;

import java.util.ArrayList;
import java.util.List;

public class   MathStatisticsDemo {
    public static void main(String[] args) {
        Utility test = new Utility();
        List<Integer> list = new ArrayList<>(test.getListRandomNumbers(10, 100));

        System.out.println("New List with elements: ");
        System.out.println(list);

        System.out.print("Even numbers: ");
        CounterNumbers<Integer> counterOne = test::getAmountOfEvenNumbers;
        System.out.println(counterOne.count(list));

        System.out.print("Odd numbers: ");
        CounterNumbers<Integer> counterTwo = test::getAmountOfOddNumbers;
        System.out.println(counterTwo.count(list));

        System.out.print("Equals zero: ");
        CounterNumbers<Integer> counterThree = test::getNumbersEqualsZero;
        System.out.println(counterThree.count(list));

        System.out.print("Equals number 22: ");
        SpecificNumberCounter<Integer> counterFour = test::getNumbersEqualsNumber;
        System.out.println(counterFour.count(list,22));
        System.out.print("Equals number 44: ");
        SpecificNumberCounter<Integer> counterFive = test::getNumbersEqualsNumber;
        System.out.println(counterFive.count(list,22));
        System.out.print("Equals number 45: ");
        SpecificNumberCounter<Integer> counterSix = test::getNumbersEqualsNumber;
        System.out.println(counterSix.count(list,45));

    }
    @FunctionalInterface
    public interface CounterNumbers<T> {
        long count(List<T> a);
    }

    @FunctionalInterface
    public interface SpecificNumberCounter<T> {
        long count(List<T> a, int number);
    }
}

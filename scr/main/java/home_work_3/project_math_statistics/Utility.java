package home_work_3.project_math_statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {
    public List<Integer> getListRandomNumbers(int listSize, int range) {
        List<Integer> listNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            listNumbers.add(random.nextInt(range));
        }
        return listNumbers;
    }

    public long getAmountOfEvenNumbers(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).count();
    }

    public long getAmountOfOddNumbers(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 1).count();
    }

    public long getNumbersEqualsZero(List<Integer> list) {
        return list.stream().filter(n -> n == 0).count();
    }

    public long getNumbersEqualsNumber(List<Integer> list, int number) {
        return list.stream().filter(n -> n == number).count();
    }
}

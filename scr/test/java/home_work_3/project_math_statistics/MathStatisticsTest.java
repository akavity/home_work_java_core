package home_work_3.project_math_statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathStatisticsTest {
    private Utility utility;
    private List<Integer> listTest;
    private List<Integer> listTestTwo;
    private List<Integer> listTestThree;

    @BeforeEach
    public void init() {
        utility = new Utility();
        listTest = new ArrayList<>(Arrays.asList(55, 84, 43, 39, 93, 96, 88, 86, 72, 14));
        listTestTwo = new ArrayList<>(Arrays.asList(7, 96, 6, 53, 61, 37, 30, 55, 0, 12));
        listTestThree = new ArrayList<>(Arrays.asList(33, 0, 23, 75, 1, 0, 59, 57, 23, 34));
    }

    @Test
    public void getAmountOfEvenNumbersTest1() {
        long actual = utility.getAmountOfEvenNumbers(listTest);

        Assertions.assertEquals(6, actual);
    }

    @Test
    public void getAmountOfEvenNumbersTest2() {
        long actual = utility.getAmountOfEvenNumbers(listTestTwo);

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void getAmountOfEvenNumbersTest3() {
        long actual = utility.getAmountOfEvenNumbers(listTestThree);

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void getAmountOfOddNumbersTest1() {
        long actual = utility.getAmountOfOddNumbers(listTest);

        Assertions.assertEquals(4, actual);
    }

    @Test
    public void getAmountOfOddNumbersTest2() {
        long actual = utility.getAmountOfOddNumbers(listTestTwo);

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void getAmountOfOddNumbersTest3() {
        long actual = utility.getAmountOfOddNumbers(listTestThree);

        Assertions.assertEquals(7, actual);
    }

    @Test
    public void getNumbersEqualsZeroTest1() {
        long actual = utility.getNumbersEqualsZero(listTest);

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void getNumbersEqualsZeroTest2() {
        long actual = utility.getNumbersEqualsZero(listTestTwo);

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void getNumbersEqualsZeroTest3() {
        long actual = utility.getNumbersEqualsZero(listTestThree);

        Assertions.assertEquals(2, actual);
    }

    @Test
    public void getNumbersEqualsNumberTest1() {
        long actual = utility.getNumbersEqualsNumber(listTest, 93);

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void getNumbersEqualsNumberTest2() {
        long actual = utility.getNumbersEqualsNumber(listTestThree, 0);

        Assertions.assertEquals(2, actual);
    }
}

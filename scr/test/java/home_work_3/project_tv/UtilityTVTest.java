package home_work_3.project_tv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilityTVTest {
    private List<TV> testTV;
    private UtilityTV utilityTV;
    private List<TV> actual;
    private List<TV> expected;

    @BeforeEach
    public void init() {
        actual = new ArrayList<>();
        expected = new ArrayList<>();
        utilityTV = new UtilityTV();
        testTV = new ArrayList<>(List.of(
                new TV("Samsung", "UE43AU7002UX", 2020, 40, 621),
                new TV("Samsung", "UE50AU7002UX", 2020, 50, 705),
                new TV("Samsung", "QE55QN700AUX", 2022, 55, 2120),
                new TV("Sony", "KD-50X81J", 2021, 50, 1368),
                new TV("Horizont", "24LE5011D", 2018, 24, 138),
                new TV("POLAR", "32PL13TC-SM", 2019, 32, 165),
                new TV("POLAR", "P32L21T2SCSM", 2017, 32, 215),
                new TV("Thomson", "40FE5606", 2019, 40, 269),
                new TV("Thomson", "32HE5606", 2020, 32, 221),
                new TV("KIVI", "32H740NB", 2018, 32, 258)));
    }

    @Test
    public void getDiagonalTVTest1() {
        actual = utilityTV.getDiagonalTV(testTV, 40);

        expected = new ArrayList<>(List.of(
                new TV("Samsung", "UE43AU7002UX", 2020, 40, 621),
                new TV("Samsung", "UE50AU7002UX", 2020, 50, 705),
                new TV("Samsung", "QE55QN700AUX", 2022, 55, 2120),
                new TV("Sony", "KD-50X81J", 2021, 50, 1368),
                new TV("Thomson", "40FE5606", 2019, 40, 269)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getDiagonalTVTest2() {
        actual = utilityTV.getDiagonalTV(testTV, 50);

        expected = new ArrayList<>(List.of(
                new TV("Samsung", "UE50AU7002UX", 2020, 50, 705),
                new TV("Samsung", "QE55QN700AUX", 2022, 55, 2120),
                new TV("Sony", "KD-50X81J", 2021, 50, 1368)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getManufacturerTVTest1() {
        actual = utilityTV.getManufacturerTV(testTV, "Horizont" );

        expected = new ArrayList<>(List.of(
                new TV("Horizont", "24LE5011D", 2018, 24, 138)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getManufacturerTVTest2() {
        actual = utilityTV.getManufacturerTV(testTV, "KIVI" );

        expected = new ArrayList<>(List.of(
                new TV("KIVI", "32H740NB", 2018, 32, 258)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getNewTVTest1() {
        actual = utilityTV.getNewTV(testTV, 2020);

        expected = new ArrayList<>(List.of(
                new TV("Samsung", "UE43AU7002UX", 2020, 40, 621),
                new TV("Samsung", "UE50AU7002UX", 2020, 50, 705),
                new TV("Samsung", "QE55QN700AUX", 2022, 55, 2120),
                new TV("Sony", "KD-50X81J", 2021, 50, 1368),
                new TV("Thomson", "32HE5606", 2020, 32, 221),
                new TV("KIVI", "32H740NB", 2018, 32, 258)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getNewTVTest2() {
        actual = utilityTV.getNewTV(testTV, 2022);

        expected = new ArrayList<>(List.of(
                new TV("Samsung", "QE55QN700AUX", 2022, 55, 2120)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getPriceRangeTest1() {
        actual = utilityTV.getPriceRange(testTV, 1000, 2000);

        expected = new ArrayList<>(List.of(
                new TV("Samsung", "QE55QN700AUX", 2022, 55, 2120),
                new TV("Sony", "KD-50X81J", 2021, 50, 1368)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getPriceRangeTest2() {
        actual = utilityTV.getPriceRange(testTV, 250, 700);

        expected = new ArrayList<>(List.of(
                new TV("Samsung", "UE43AU7002UX", 2020, 40, 621),
                new TV("Samsung", "UE50AU7002UX", 2020, 50, 705),
                new TV("Thomson", "40FE5606", 2019, 40, 269),
                new TV("KIVI", "32H740NB", 2018, 32, 258)));
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void getTVSortedByPriceTest1() {
        actual = utilityTV.getTVSortedByPrice(testTV, true);


        Assertions.assertEquals("24LE5011D", actual.get(0).getModel());
    }

    @Test
    public void getTVSortedByPriceTest2() {
        actual = utilityTV.getTVSortedByPrice(testTV, true);

        Assertions.assertEquals("40FE5606", actual.get(5).getModel());
    }

    @Test
    public void getTVSortedByPriceTest3() {
        actual = utilityTV.getTVSortedByPrice(testTV, true);

        Assertions.assertEquals("UE43AU7002UX", actual.get(6).getModel());
    }

    @Test
    public void getTVSortedByPriceTest4() {
        actual = utilityTV.getTVSortedByPrice(testTV, false);

        Assertions.assertEquals("32PL13TC-SM", actual.get(8).getModel());
    }

    @Test
    public void getTVSortedByPriceTest5() {
        actual = utilityTV.getTVSortedByPrice(testTV, false);

        Assertions.assertEquals("UE50AU7002UX", actual.get(2).getModel());
    }

    @Test
    public void getTVSortedByDiagonalTest1() {
        actual = utilityTV.getTVSortedByDiagonal(testTV, true);

        Assertions.assertEquals("P32L21T2SCSM", actual.get(2).getModel());
    }

    @Test
    public void getTVSortedByDiagonalTest2() {
        actual = utilityTV.getTVSortedByDiagonal(testTV, false);

        Assertions.assertEquals("P32L21T2SCSM", actual.get(6).getModel());
    }
}

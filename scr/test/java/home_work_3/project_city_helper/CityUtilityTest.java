package home_work_3.project_city_helper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityUtilityTest {
    private List<String> actual;
    private List<String> cities;
    private List<String> citiesTwo;
    private CityUtility cityUtility;

    @BeforeEach
    public void init() {
        cityUtility = new CityUtility();
        actual = new ArrayList<>();
        cities = new ArrayList<>(Arrays.asList("Minsk", "Brest", "Berlin", "Dresden", "Warsaw",
                "Minsk", "Dresden", "Minsk"));
        citiesTwo = new ArrayList<>(Arrays.asList("Minsk", "Kiev", "Dresden", "Vilnius", "Delhi", "Dresden", "Kiev"));
    }

    @Test
    public void getUniqueCitiesTest1() {
        actual = cityUtility.getUniqueCities(cities);

        List<String> expect = new ArrayList<>(Arrays.asList("Minsk", "Brest", "Berlin", "Dresden", "Warsaw"));
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getUniqueCitiesTest2() {
        actual = cityUtility.getUniqueCities(citiesTwo);

        List<String> expect = new ArrayList<>(Arrays.asList("Minsk", "Kiev", "Dresden", "Vilnius", "Delhi"));
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getCitiesWithNameLengthTest1() {
        actual = cityUtility.getCitiesWithNameLength(cities, 5);

        List<String> expect = new ArrayList<>(Arrays.asList("Minsk", "Brest", "Berlin", "Dresden", "Warsaw"));
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getCitiesWithNameLengthTest2() {
        actual = cityUtility.getCitiesWithNameLength(citiesTwo, 6);

        List<String> expect = new ArrayList<>(Arrays.asList("Dresden", "Vilnius"));
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getCitiesWithFirstCharTest1() {
        actual = cityUtility.getCitiesWithFirstChar(cities, 'M');

        List<String> expect = new ArrayList<>(List.of("Minsk"));
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getCitiesWithFirstCharTest2() {
        actual = cityUtility.getCitiesWithFirstChar(citiesTwo, 'D');

        List<String> expect = new ArrayList<>(Arrays.asList("Dresden", "Delhi"));
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void getCityCounterTest1() {
        long actual = cityUtility.getCityCounter(cities, "Minsk");

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void getCityCounterTest2() {
        long actual = cityUtility.getCityCounter(citiesTwo, "Dresden");

        Assertions.assertEquals(2, actual);
    }
}

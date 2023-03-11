package home_work_3.project_city_helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityUtilityDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Minsk", "Brest", "Berlin", "Dresden", "Warsaw",
                "Minsk", "Kiev", "Vilnius", "Delhi", "Dresden", "Minsk"));

        CityUtility test = new CityUtility();

        System.out.print("Task 01\n All unique cities: ");
        FilterCities<String> filter = test::getUniqueCities;
        test.printList(filter.returnList(cities));

        System.out.print("Task 02\n With a name that is longer than ...\n");
        System.out.print("6 char and more: ");
        FilterCitiesNameLength<String> filterTwo = test::getCitiesWithNameLength;
        test.printList(filterTwo.returnList(cities, 6));
        System.out.println(" ");
        System.out.print("4 char and more: ");
        test.printList(filterTwo.returnList(cities, 4));

        System.out.print("Task 03\n Starting with a given letter\n");
        System.out.print("symbol 'D': ");
        FilterCitiesFirstChar<String> filterThree = test::getCitiesWithFirstChar;
        test.printList(filterThree.returnList(cities, 'D'));
        System.out.println(" ");
        System.out.print("symbol 'B': ");
        test.printList(filterThree.returnList(cities, 'B'));

        System.out.print("Task 04\n Number of uses of a particular city in the list\n");
        System.out.print("city 'Minsk': ");
        CounterCity<String> counter = test::getCityCounter;
        System.out.println(counter.count(cities, "Minsk"));
        System.out.print("city 'Dresden': ");
        System.out.println(counter.count(cities, "Dresden"));
    }

    @FunctionalInterface
    public interface FilterCities<T> {
        List<T> returnList(List<T> a);
    }

    @FunctionalInterface
    public interface FilterCitiesNameLength<T> {
        List<T> returnList(List<T> a, int length);
    }

    @FunctionalInterface
    public interface FilterCitiesFirstChar<T> {
        List<T> returnList(List<T> a, char firstSymbol);
    }

    @FunctionalInterface
    public interface CounterCity<T> {
        long count(List<T> a, String cityName);
    }
}

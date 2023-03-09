package home_work_3.project_city_helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityUtilityDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Minsk", "Brest", "Berlin", "Dresden", "Warsaw",
                "Minsk", "Kiev", "Vilnius", "Delhi", "Dresden", "Minsk" ));

        CityUtility test = new CityUtility();

        System.out.print("Task 01\n All unique cities: ");
        System.out.println(test.getUniqueCities(cities));

        System.out.print("Task 02\n With a name that is longer than ...\n");
        System.out.print("6 char and more: ");
        System.out.println(test.getCitiesWithNameLength(cities, 6));
        System.out.print("4 char and more: ");
        System.out.println(test.getCitiesWithNameLength(cities, 4));

        System.out.print("Task 03\n Starting with a given letter\n");
        System.out.print("symbol 'D': ");
        System.out.println(test.getCitiesWithFirstChar(cities, 'D'));
        System.out.print("symbol 'B': ");
        System.out.println(test.getCitiesWithFirstChar(cities, 'B'));

        System.out.print("Task 04\n Number of uses of a particular city in the list\n");
        System.out.print("city 'Minsk': ");
        System.out.println(test.getCityCounter(cities, "Minsk"));
        System.out.print("city 'Dresden': ");
        System.out.println(test.getCityCounter(cities, "Dresden"));
    }
}

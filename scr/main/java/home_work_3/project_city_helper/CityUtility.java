package home_work_3.project_city_helper;

import java.util.List;
import java.util.Objects;

public class CityUtility {
    public void printUniqueCities(List<String> cities) {
         cities.stream().distinct().forEach(System.out::println);
    }

    public void printCitiesWithNameLength(List<String> cities, int length) {
        cities.stream().distinct().filter(n -> n.length() >= length).forEach(System.out::println);
    }

    public void printCitiesWithFirstChar(List<String> cities, char symbol) {
        cities.stream().distinct().filter(n -> n.charAt(0) == symbol).forEach(System.out::println);
    }

    public long getCityCounter(List<String> cities, String city) {
       return cities.stream().filter(n -> Objects.equals(n, city)).count();
    }
}

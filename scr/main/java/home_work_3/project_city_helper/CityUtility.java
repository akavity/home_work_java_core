package home_work_3.project_city_helper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CityUtility {
    public List<String> getUniqueCities(List<String> cities) {
        return cities.stream().distinct().collect(Collectors.toList());
    }

    public List<String> getCitiesWithNameLength(List<String> cities, int length) {
        return cities.stream().distinct().filter(n -> n.length() >= length).collect(Collectors.toList());
    }

    public List<String> getCitiesWithFirstChar(List<String> cities, char symbol) {
        return cities.stream().distinct().filter(n -> n.charAt(0) == symbol).collect(Collectors.toList());
    }

    public long getCityCounter(List<String> cities, String city) {
        return cities.stream().filter(n -> Objects.equals(n, city)).count();
    }

    public void printUniqueCities(List<String> cities) {
        cities.stream().distinct().forEach(System.out::println);
    }

    public void printCitiesWithNameLength(List<String> cities, int length) {
        cities.stream().distinct().filter(n -> n.length() >= length).forEach(System.out::println);
    }

    public void printCitiesWithFirstChar(List<String> cities, char symbol) {
        cities.stream().distinct().filter(n -> n.charAt(0) == symbol).forEach(System.out::println);
    }
}

package home_work_3.project_tv;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class UtilityTV {
    public void printDiagonalTV(List<TV> list, int diagonal) {
        list.stream()
                .filter(n -> n.getDiagonal() == diagonal)
                .forEach(System.out::println);
    }

    public void printManufacturerTV(List<TV> list, String manufacturer) {
        list.stream()
                .filter(n -> Objects.equals(n.getManufacturer(), manufacturer))
                .forEach(System.out::println);
    }

    public void printNewTV(List<TV> list, int releaseYear) {
        list.stream()
                .filter(n -> n.getReleaseYear() > releaseYear)
                .forEach(System.out::println);
    }

    public void printPriceRange(List<TV> list, int minPrice, int maxPrice) {
        list.stream()
                .filter(n -> (n.getPrice() >= minPrice && n.getPrice() <= maxPrice))
                .forEach(System.out::println);
    }

    public void printTVSortedByPriceAscending(List<TV> list) {
        list.stream()
                .sorted(Comparator.comparing(TV::getPrice))
                .forEach(System.out::println);
    }

    public void printTVSortedByPriceDescending(List<TV> list) {
        list.stream()
                .sorted(Comparator.comparing(TV::getPrice).reversed())
                .forEach(System.out::println);
    }

    public void printTVSortedByDiagonalAscending(List<TV> list) {
        list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal))
                .forEach(System.out::println);
    }

    public void printTVSortedByDiagonaDescending(List<TV> list) {
        list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal).reversed())
                .forEach(System.out::println);
    }
}

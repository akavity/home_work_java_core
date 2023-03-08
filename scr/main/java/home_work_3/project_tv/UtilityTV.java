package home_work_3.project_tv;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UtilityTV {
    public List<TV> getDiagonalTV(List<TV> list, int diagonal) {
        return list.stream()
                .filter(n -> n.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getManufacturerTV(List<TV> list, String manufacturer) {
        return list.stream()
                .filter(n -> Objects.equals(n.getManufacturer(), manufacturer))
                .collect(Collectors.toList());
    }

    public List<TV> getNewTV(List<TV> list, int releaseYear) {
        return list.stream()
                .filter(n -> n.getReleaseYear() > releaseYear)
                .collect(Collectors.toList());
    }

    public List<TV> printPriceRange(List<TV> list, int minPrice, int maxPrice) {
        return list.stream()
                .filter(n -> (n.getPrice() >= minPrice && n.getPrice() <= maxPrice))
                .collect(Collectors.toList());
    }

    public List<TV> printTVSortedByPrice(List<TV> list, boolean rise) {
        List<TV> result;
        if (rise) {
            result = list.stream()
                    .sorted(Comparator.comparing(TV::getPrice))
                    .collect(Collectors.toList());
        } else {
            result = list.stream()
                    .sorted(Comparator.comparing(TV::getPrice).reversed())
                    .collect(Collectors.toList());

        }
        return result;
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

    public void printTVSortedByDiagonalDescending(List<TV> list) {
        list.stream()
                .sorted(Comparator.comparing(TV::getDiagonal).reversed())
                .forEach(System.out::println);
    }
}

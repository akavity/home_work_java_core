package home_work_3.project_tv;

import java.util.ArrayList;
import java.util.List;

public class DemoTV {
    public static void main(String[] args) {
        List<TV> testTV = new ArrayList<>(List.of(
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

        UtilityTV onliner = new UtilityTV();

        System.out.println("getting TVs with a given diagonal.\n");
        System.out.println("TV with a diagonal 32\":");
        FilterDiagonalTV<TV> filterOne = onliner::getDiagonalTV;
        onliner.print(filterOne.returnList(testTV, 32));
        System.out.println("TV with a diagonal 40\":");
        onliner.print(filterOne.returnList(testTV, 40));

        System.out.println("\ngetting TVs from a certain manufacturer.\n");
        System.out.println("POLAR:");
        FilterManufacturerTV<TV> filterTwo = onliner::getManufacturerTV;
        onliner.print(filterTwo.returnList(testTV, "POLAR"));
        System.out.println("Horizont:");
        onliner.print(filterTwo.returnList(testTV, "Horizont"));

        System.out.println("\nreceiving TVs no older than a certain year.\n");
        System.out.println("2020");
        FilterReleaseYearTV<TV> filterTree = onliner::getNewTV;
        onliner.print(filterTree.returnList(testTV, 2020));
        System.out.println("2022");
        onliner.print(filterTree.returnList(testTV, 2022));

        System.out.println("\ngetting TVs with a price in some range.\n");
        System.out.println("1000 - 2000 $");
        FilterPriceTV<TV> filterFour = onliner::getPriceRange;
        onliner.print(filterFour.returnList(testTV, 1000, 2000));
        System.out.println("400 - 800 $");
        onliner.print(filterFour.returnList(testTV, 400, 800));

        System.out.println("\ngetting TVs sorted by price.\n");
        SorterTV<TV> sorter = onliner::getTVSortedByPrice;
        onliner.print(sorter.returnList(testTV, false));
        System.out.println("\nsorted diagonally.\n");
        SorterTV<TV> sorterTwo = onliner::getTVSortedByDiagonal;
        onliner.print(sorterTwo.returnList(testTV, false));
    }

    @FunctionalInterface
    public interface FilterDiagonalTV<T> {
        List<T> returnList(List<T> a, int b);
    }

    @FunctionalInterface
    public interface FilterManufacturerTV<T> {
        List<T> returnList(List<T> a, String manufacture);
    }

    @FunctionalInterface
    public interface FilterReleaseYearTV<T> {
        List<T> returnList(List<T> a, int releaseYear);
    }

    @FunctionalInterface
    public interface FilterPriceTV<T> {
        List<T> returnList(List<T> a, int minPrice, int maxPrice);
    }

    @FunctionalInterface
    public interface SorterTV<T> {
        List<T> returnList(List<T> a, boolean rising);
    }
}

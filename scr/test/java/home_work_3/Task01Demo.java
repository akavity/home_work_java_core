package home_work_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task01Demo {
    public static void main(String[] args) {
        Task01 task01 = new Task01();
        List<String> list = new ArrayList<>(List.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"));
        Map<String, String> map = new HashMap<>(Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"));

        System.out.println("Map arguments and values: ");
        FilterMapFromList<String> filter = task01::getMapFromArray;
        task01.printMap(filter.returnMap(list));

        System.out.print("List arguments and values: ");
        FilterListFromMap<String> filterTwo = task01::getArrayFromMap;
        task01.printList(filterTwo.returnList(map));
    }

    @FunctionalInterface
    public interface FilterMapFromList<T> {
        Map<T, T> returnMap(List<T> a);
    }

    @FunctionalInterface
    public interface FilterListFromMap<T> {
        List<T> returnList(Map<T, T> a);
    }
}

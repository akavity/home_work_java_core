package home_work_3;

import java.util.*;

public class Task01 {

    public Map<String, String> getMapFromArray(List<String> strings) {
        Map<String, String> map = new HashMap<>();
        String[] key = new String[1];
        String[] value = new String[1];
        for (String str : strings) {
            if (str.charAt(0) == '-') {
                key[0] = str;
            } else {
                value[0] = str;
                map.put(key[0], value[0]);
            }
        }
        return map;
    }

    public List<String> getArrayFromMap(Map<String, String> map) {
        List<String> strings = new LinkedList<>();
        for (Map.Entry<String, String> item : map.entrySet()) {
            strings.add(item.getKey());
            strings.add(item.getValue());
        }
        return strings;
    }

    public void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.printf("Key: %s   Value: %s\n", item.getKey(), item.getValue());
        }
    }

    public void printList(List<String> list) {
        for (String st : list) {
            System.out.print(st + " ");
        }
    }
}

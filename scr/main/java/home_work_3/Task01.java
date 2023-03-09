package home_work_3;

import java.util.*;

public class Task01 {

    public static Map<String, String> getMapFromArray(List<String> strings) {
        Map<String, String> map = new HashMap<>();
        Runnable runnable = () -> {
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
        };
        runnable.run();
        return map;
    }

    public static List<String> getArrayFromMap(Map<String, String> map) {
        List<String> strings = new LinkedList<>();
        Runnable runnable = () -> {
            for (Map.Entry<String, String> item : map.entrySet()) {
                strings.add(item.getKey());
                strings.add(item.getValue());
            }
        };
        runnable.run();
        return strings;
    }
}

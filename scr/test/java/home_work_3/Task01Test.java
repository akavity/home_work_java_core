package home_work_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Task01Test {
    private Task01 task01;
    private Map<String, String> mapTest;
    private List<String> listTest;
    private List<String> listFromMap;

    @BeforeEach
    public void init() {
        task01 = new Task01();
        listFromMap = new ArrayList<>();
        mapTest = new HashMap<>();
        listTest = new ArrayList<>(Arrays.asList("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt" ));
    }

    @Test
    public void getMapFromArrayTest1() {
        mapTest = task01.getMapFromArray(listTest);

        Assertions.assertEquals("in.txt", mapTest.get("-i" ));
    }

    @Test
    public void getMapFromArrayTest2() {
        mapTest = task01.getMapFromArray(listTest);

        Assertions.assertEquals("40", mapTest.get("--limit" ));
    }

    @Test
    public void getMapFromArrayTest3() {
        mapTest = task01.getMapFromArray(listTest);

        Assertions.assertEquals("1", mapTest.get("-d" ));
    }

    @Test
    public void getMapFromArrayTest4() {
        mapTest = task01.getMapFromArray(listTest);

        Assertions.assertEquals("out.txt", mapTest.get("-o" ));
    }

    @Test
    public void getArrayFromMapTest1() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("out.txt" ));
    }

    @Test
    public void getArrayFromMapTest2() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("-o" ));
    }

    @Test
    public void getArrayFromMapTest3() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("1" ));
    }

    @Test
    public void getArrayFromMapTest4() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("-d" ));
    }

    @Test
    public void getArrayFromMapTest5() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("--limit" ));
    }

    @Test
    public void getArrayFromMapTest6() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("40" ));
    }

    @Test
    public void getArrayFromMapTest7() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("in.txt" ));
    }

    @Test
    public void getArrayFromMapTest8() {
        mapTest = task01.getMapFromArray(listTest);

        listFromMap = task01.getArrayFromMap(mapTest);

        Assertions.assertTrue(listFromMap.contains("-i" ));
    }
}

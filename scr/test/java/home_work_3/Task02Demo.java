package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Task02Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"));
        Task02 test = new Task02();

        Columns columns = test::getColumns;
        columns.print(1, 1);

        ColumnsFive columnsTwo = test::getFiveColumns;
        columnsTwo.print();
    }

    @FunctionalInterface
    public interface Columns {
        void print(int a, int b);
    }

    @FunctionalInterface
    public interface ColumnsFive {
        void print();
    }
}

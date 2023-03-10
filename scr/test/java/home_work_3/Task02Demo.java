package home_work_3;

import java.util.ArrayList;
import java.util.List;

public class Task02Demo {
    public static void main(String[] args) {
        Task02 test = new Task02();

        Columns columns = test::getColumns;
        columns.print(1, 1);

        Columns columnsTwo = test::getFiveColumns;
        columnsTwo.print(1, 5);
        System.out.print("\n");
        columnsTwo.print(6, 10);
    }

    @FunctionalInterface
    public interface Columns {
        void print(int a, int b);
    }
}

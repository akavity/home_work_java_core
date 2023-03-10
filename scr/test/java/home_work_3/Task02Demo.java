package home_work_3;


public class Task02Demo {
    public static void main(String[] args) {
        Task02 test = new Task02();
        Columns columns = test::getColumns;
        columns.print(1, 1);
    }

    @FunctionalInterface
    public interface Columns {
        void print(int a, int b);
    }
}

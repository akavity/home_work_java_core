package home_work_3;

public class Task02 {
    public void getColumns(int multiplier, int multiplicand) {
        while (multiplier <= 10) {
            while (multiplicand <= 10) {
                System.out.printf("%d * %d = %d       \t", multiplier, multiplicand, multiplier * multiplicand);
                System.out.println(" ");
                multiplicand++;
            }
            System.out.println("\n");
            multiplicand = 1;
            multiplier++;
        }
    }

    public void getFiveColumns() {
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.printf("%d * %d = %d       \t", j, i, j * i);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            for(int j = 6; j <= 10; j++) {
                System.out.printf("%d * %d = %d       \t", j, i, j * i);
            }
            System.out.println(" ");
        }
    }
}

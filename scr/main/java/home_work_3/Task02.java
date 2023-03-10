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
}

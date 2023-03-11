package home_work_4.calcs.additional;

import home_work_4.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private int count;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}

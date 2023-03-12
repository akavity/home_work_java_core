package home_work_4.calcs.additional;

import home_work_4.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private int count;

    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double pow(double a, int b) {
        incrementCountOperation();
        return calculator.pow(a, b);
    }

    public double module(double a) {
        incrementCountOperation();
        return calculator.module(a);
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        return calculator.squareRoot(a);
    }

    public double plus(double a, double b) {
        incrementCountOperation();
        return calculator.plus(a, b);
    }

    public double minus(double a, double b) {
        incrementCountOperation();
        return calculator.minus(a, b);
    }

    public double mul(double a, double b) {
        incrementCountOperation();
        return calculator.mul(a, b);
    }

    public double div(double a, double b) {
        incrementCountOperation();
        return calculator.div(a, b);
    }
}

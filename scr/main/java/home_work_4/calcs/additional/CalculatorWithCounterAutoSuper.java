package home_work_4.calcs.additional;

import home_work_4.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int count;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public double module(double a) {
        incrementCountOperation();
        return super.module(a);
    }

    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return super.squareRoot(a);
    }

    @Override
    public double plus(double a, double b) {
        incrementCountOperation();
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double mul(double a, double b) {
        incrementCountOperation();
        return super.mul(a, b);
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }
}

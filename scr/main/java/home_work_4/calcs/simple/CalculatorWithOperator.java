package home_work_4.calcs.simple;

import home_work_4.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double pow(double a, int b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result = mul(result, a);
        }
        return result;
    }

    public double module(double a) {
        return (a < 0.0) ? 0.0 - a : a;
    }

    public double squareRoot(double a) {
        double b;
        double result = a / 2;
        do {
            b = result;
            result = (b + (a / b)) / 2;
        } while ((b - result) != 0);
        return result;
    }
}

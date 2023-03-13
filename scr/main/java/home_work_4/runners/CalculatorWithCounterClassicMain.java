package home_work_4.runners;

import home_work_4.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double div = calculator.div(28.5, 5);
        calculator.incrementCountOperation();
        double pow = calculator.pow(div, 2);
        calculator.incrementCountOperation();
        double mul = calculator.mul(15, 7);
        calculator.incrementCountOperation();
        double plus = calculator.plus(mul, pow);
        calculator.incrementCountOperation();
        double result = calculator.plus(4.1, plus);
        calculator.incrementCountOperation();
        System.out.println(calculator.getCountOperation());
        System.out.println(result);
    }
}

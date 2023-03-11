package home_work_4.runners;

import home_work_4.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double div = calculator.div(28.5, 5);
        double pow = calculator.pow(div, 2);
        double mul = calculator.mul(15, 7);
        double plus = calculator.plus(mul, pow);
        double result = calculator.plus(4.1, plus);
        System.out.println(result);
    }
}
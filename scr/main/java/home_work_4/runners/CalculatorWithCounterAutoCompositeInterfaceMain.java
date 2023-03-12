package home_work_4.runners;

import home_work_4.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_4.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAggregationInterface calculator = new CalculatorWithCounterAutoAggregationInterface(new CalculatorWithOperator());
        double div = calculator.div(28.5, 5);
        double pow = calculator.pow(div, 2);
        double mul = calculator.mul(15, 7);
        double plus = calculator.plus(mul, pow);
        double result = calculator.plus(4.1, plus);
        System.out.println(calculator.getCountOperation());
        System.out.println(result);
    }
}

package home_work_4.runners;

import home_work_4.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import home_work_4.calcs.simple.CalculatorWithMathCopy;
import home_work_4.calcs.simple.CalculatorWithMathExtends;
import home_work_4.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAggregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAggregation calculatorOne = new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAggregation calculatorTwo = new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAggregation calculatorThree = new CalculatorWithCounterAutoChoiceAggregation(new CalculatorWithMathExtends());

        double div = calculatorOne.div(28.5, 5);
        double pow = calculatorOne.pow(div, 2);
        double mul = calculatorOne.mul(15, 7);
        double plus = calculatorOne.plus(mul, pow);
        double result = calculatorOne.plus(4.1, plus);
        System.out.println(calculatorOne.getCountOperation());
        System.out.println(result);

        double div2 = calculatorTwo.div(28.5, 5);
        double pow2 = calculatorTwo.pow(div2, 2);
        double mul2 = calculatorTwo.mul(15, 7);
        double plus2 = calculatorTwo.plus(mul2, pow2);
        double result2 = calculatorTwo.plus(4.1, plus2);
        System.out.println(calculatorTwo.getCountOperation());
        System.out.println(result2);

        double div3 = calculatorThree.div(28.5, 5);
        double pow3 = calculatorThree.pow(div3, 2);
        double mul3 = calculatorThree.mul(15, 7);
        double plus3 = calculatorThree.plus(mul3, pow3);
        double result3 = calculatorThree.plus(4.1, plus3);
        System.out.println(calculatorThree.getCountOperation());
        System.out.println(result3);
    }
}

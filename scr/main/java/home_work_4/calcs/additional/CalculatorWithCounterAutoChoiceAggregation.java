package home_work_4.calcs.additional;

import home_work_4.calcs.simple.CalculatorWithMathCopy;
import home_work_4.calcs.simple.CalculatorWithMathExtends;
import home_work_4.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAggregation {
    private int count;
    private CalculatorWithOperator calculatorOne;
    private CalculatorWithMathCopy calculatorTwo;
    private CalculatorWithMathExtends calculatorTree;

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calculatorOne) {
        this.calculatorOne = calculatorOne;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calculatorTwo) {
        this.calculatorTwo = calculatorTwo;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calculatorTree) {
        this.calculatorTree = calculatorTree;
    }

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double pow(double a, int b) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.pow(a, b);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.pow(a, b);
        } else {
            result = calculatorTree.pow(a, b);
        }
        return result;
    }

    public double module(double a) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.module(a);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.module(a);
        } else {
            result = calculatorTree.module(a);
        }
        return result;
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.squareRoot(a);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.squareRoot(a);
        } else {
            result = calculatorTree.squareRoot(a);
        }
        return result;
    }

    public double plus(double a, double b) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.plus(a, b);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.plus(a, b);
        } else {
            result = calculatorTree.plus(a, b);
        }
        return result;
    }

    public double minus(double a, double b) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.minus(a, b);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.minus(a, b);
        } else {
            result = calculatorTree.minus(a, b);
        }
        return result;
    }

    public double mul(double a, double b) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.mul(a, b);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.mul(a, b);
        } else {
            result = calculatorTree.mul(a, b);
        }
        return result;
    }

    public double div(double a, double b) {
        incrementCountOperation();
        double result;
        if (calculatorOne != null) {
            result = calculatorOne.div(a, b);
        } else if (calculatorTwo != null) {
            result = calculatorTwo.div(a, b);
        } else {
            result = calculatorTree.div(a, b);
        }
        return result;
    }
}

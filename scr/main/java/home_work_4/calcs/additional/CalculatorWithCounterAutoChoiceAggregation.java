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
        return calculatorOne.pow(a, b);
    }

    public double module(double a) {
        incrementCountOperation();
        return calculatorOne.module(a);
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        return calculatorOne.squareRoot(a);
    }

    public double plus(double a, double b) {
        incrementCountOperation();
        return calculatorOne.plus(a, b);
    }

    public double minus(double a, double b) {
        incrementCountOperation();
        return calculatorOne.minus(a, b);
    }

    public double mul(double a, double b) {
        incrementCountOperation();
        return calculatorOne.mul(a, b);
    }

    public double div(double a, double b) {
        incrementCountOperation();
        return calculatorOne.div(a, b);
    }

    public double powTwo(double a, int b) {
        incrementCountOperation();
        return calculatorTwo.pow(a, b);
    }

    public double moduleTwo(double a) {
        incrementCountOperation();
        return calculatorTwo.module(a);
    }

    public double squareRootTwo(double a) {
        incrementCountOperation();
        return calculatorTwo.squareRoot(a);
    }

    public double plusTwo(double a, double b) {
        incrementCountOperation();
        return calculatorTwo.plus(a, b);
    }

    public double minusTwo(double a, double b) {
        incrementCountOperation();
        return calculatorTwo.minus(a, b);
    }

    public double mulTwo(double a, double b) {
        incrementCountOperation();
        return calculatorTwo.mul(a, b);
    }

    public double divTwo(double a, double b) {
        incrementCountOperation();
        return calculatorTwo.div(a, b);
    }


    public double powTree(double a, int b) {
        incrementCountOperation();
        return calculatorTree.pow(a, b);
    }

    public double moduleTree(double a) {
        incrementCountOperation();
        return calculatorTree.module(a);
    }

    public double squareRootTree(double a) {
        incrementCountOperation();
        return calculatorTree.squareRoot(a);
    }

    public double plusTree(double a, double b) {
        incrementCountOperation();
        return calculatorTree.plus(a, b);
    }

    public double minusTree(double a, double b) {
        incrementCountOperation();
        return calculatorTree.minus(a, b);
    }

    public double mulTree(double a, double b) {
        incrementCountOperation();
        return calculatorTree.mul(a, b);
    }

    public double divTree(double a, double b) {
        incrementCountOperation();
        return calculatorTree.div(a, b);
    }
}

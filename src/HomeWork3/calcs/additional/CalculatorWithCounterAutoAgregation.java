package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculatorWithMathCopy;


    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    long count;

    public void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }

    public double add(double a, double b) {
        incrementCountOperation();
        return calculatorWithMathCopy.add(a, b);
    }

    public double sub(double a, double b) {
        incrementCountOperation();
        return calculatorWithMathCopy.sub(a, b);
    }

    public double mult(double a, double b) {
        return calculatorWithMathCopy.mult(a, b);
    }

    public double div(double a, double b) {
        incrementCountOperation();
        return calculatorWithMathCopy.div(a, b);
    }

    public double pow(double a, int b) {
        incrementCountOperation();
        return calculatorWithMathCopy.pow(a, b);
    }

    public double sqrt(double a) {
        incrementCountOperation();
        return calculatorWithMathCopy.sqrt(a);
    }

    public double abs(double a) {
        incrementCountOperation();
        return calculatorWithMathCopy.abs(a);
    }
}



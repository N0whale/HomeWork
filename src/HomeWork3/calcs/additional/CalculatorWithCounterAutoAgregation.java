package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculator1;
    private CalculatorWithMathExtends calculator2;
    private CalculatorWithOperator calculator3;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator1 = calculator;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculator) {
        this.calculator2 = calculator;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator) {
        this.calculator3 = calculator;
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
        if (calculator1 != null) {
            return calculator1.add(a, b);
        } else if (calculator2 != null) {
            return calculator2.add(a, b);
        } else return calculator3.add(a, b);
    }
    public double sub(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.sub(a, b);
        } else if (calculator2 != null) {
            return calculator2.sub(a, b);
        } else return calculator3.sub(a, b);
    }
    public double mult(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.mult(a, b);
        } else if (calculator2 != null) {
            return calculator2.mult(a, b);
        } else return calculator3.mult(a, b);
    }
    public double div(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.div(a, b);
        } else if (calculator2 != null) {
            return calculator2.div(a, b);
        } else return calculator3.div(a, b);
    }
    public double pow(double a, int b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.pow(a, b);
        } else if (calculator2 != null) {
            return calculator2.pow(a, b);
        } else return calculator3.pow(a, b);
    }
    public double sqrt(double a) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.sqrt(a);
        } else if (calculator2 != null) {
            return calculator2.sqrt(a);
        } else return calculator3.sqrt(a);
    }
    public double abs(double a) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.abs(a);
        } else if (calculator2 != null) {
            return calculator2.abs(a);
        } else return calculator3.abs(a);
    }
}



package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double abs(double a) {
        return Math.abs(a);
    }
}

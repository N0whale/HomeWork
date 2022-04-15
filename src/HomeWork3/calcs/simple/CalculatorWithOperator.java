package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public double sqrt(double a) {
        double b;
        double root = a / 2;
        do {
            b = root;
            root = (b + (a / b)) / 2;
        } while ((b - root) != 0);
        return root;
    }

    public double abs (double a) {
        if (a < 0){
            return a * -1;
        } else return a;
    }
}

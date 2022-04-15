package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }



}

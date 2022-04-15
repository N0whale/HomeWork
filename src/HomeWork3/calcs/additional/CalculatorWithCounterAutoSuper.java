package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a , b);
    }

    @Override
    public double sub(double a, double b) {
        incrementCountOperation();
        return super.sub(a, b);
    }

    @Override
    public double mult(double a, double b) {
        incrementCountOperation();
        return super.mult(a , b);
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a , b);
    }

    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a , b);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    long count;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

}

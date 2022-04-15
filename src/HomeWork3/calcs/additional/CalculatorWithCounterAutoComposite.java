package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

    long count;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    public double add(double a, double b) {
        incrementCountOperation();
        return calculator.add(a , b);
    }


    public double sub(double a, double b) {
        incrementCountOperation();
        return calculator.sub(a, b);
    }


    public double mult(double a, double b) {
        incrementCountOperation();
        return calculator.mult(a , b);
    }


    public double div(double a, double b) {
        incrementCountOperation();
        return calculator.div(a , b);
    }


    public double pow(double a, int b) {
        incrementCountOperation();
        return calculator.pow(a , b);
    }


    public double sqrt(double a) {
        incrementCountOperation();
        return calculator.sqrt(a);
    }


    public double abs(double a) {
        incrementCountOperation();
        return calculator.abs(a);
    }





}

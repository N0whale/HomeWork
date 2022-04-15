package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double result;
        double a;

        result = calculator.div(28, 5);
        calculator.incrementCountOperation();
        result = calculator.pow(result, 2);
        calculator.incrementCountOperation();
        a = calculator.mult(15,7);
        calculator.incrementCountOperation();
        result = calculator.add(a,result);
        calculator.incrementCountOperation();
        result = calculator.add(4.1, result);
        calculator.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований " + calculator.getCountOperation());
    }
}

package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double result;

        // запись по действиям
        result = calculator.div(28, 5);
        result = calculator.pow(result, 2);
        result = calculator.add(result, calculator.mult(15, 7));
        result = calculator.add(4.1, result);

        // запись в одну строку
        result = calculator.add(4.1, calculator.add(calculator.mult(15, 7), calculator.pow(calculator.div(28, 5), 2)));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}

package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double result;
        double a;

        result = calculator.div(28, 5);
        result = calculator.pow(result, 2);
        a = calculator.mult(15, 7);
        result = calculator.add(a, result);
        result = calculator.add(4.1, result);


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований " + calculator.getCountOperation());
    }

}


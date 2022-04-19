package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();

        double result;
        double resultTemp;

        result = calculator.div(28, 5);
        result = calculator.pow(result, 2);
        resultTemp = calculator.mult(15,7);
        result = calculator.add(result, resultTemp);
        result = calculator.add(4.1, result);
        System.out.println("Ответ " + result);
        System.out.println(calculator.getCountOperation());
    }
}

package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new CalculatorWithOperator();
        CalculatorWithMemory calculator = new CalculatorWithMemory(iCalculator);

        double result;
        double resultTemp;

        result = calculator.div(28, 5);
        System.out.println("В памяти " + calculator.inMemory());
        result = calculator.pow(result, 2);
        System.out.println("В памяти " + calculator.inMemory());
        resultTemp = calculator.mult(15,7);
        System.out.println("В памяти " + calculator.inMemory());
        result = calculator.add(result, resultTemp);
        System.out.println("В памяти " + calculator.inMemory());
        result = calculator.add(4.1, result);
        System.out.println("В памяти " + calculator.inMemory());
        System.out.println("Ответ " + result);
    }
}

package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        ICalculator calculator1 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculator1_1 = new CalculatorWithCounterAutoAgregationInterface(calculator1);
        double result = calculator1_1.add(4.1, calculator1_1.add(calculator1_1.mult(15, 7), calculator1_1.pow(calculator1_1.div(28, 5), 2)));
        System.out.println("Используя MathCopy ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator1_1.getCountOperation());

        ICalculator calculator2 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregationInterface calculator2_1 = new CalculatorWithCounterAutoAgregationInterface(calculator2);
        result =  result = calculator2_1.add(4.1, calculator2_1.add(calculator2_1.mult(15, 7), calculator2_1.pow(calculator2_1.div(28, 5), 2)));
        System.out.println("\nИспользуя MathExtends ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator2_1.getCountOperation());

        ICalculator calculator3 = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calculator3_1 = new CalculatorWithCounterAutoAgregationInterface(calculator3);
        result =  result = calculator3_1.add(4.1, calculator3_1.add(calculator3_1.mult(15, 7), calculator3_1.pow(calculator3_1.div(28, 5), 2)));
        System.out.println("\nИспользуя WithOperator ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator2_1.getCountOperation());



    }
}

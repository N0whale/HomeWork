package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);
        double result = calculator1.add(4.1, calculator1.add(calculator1.mult(15, 7), calculator1.pow(calculator1.div(28, 5), 2)));
        System.out.println("\nИспользуя Agregation с MathCopy ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator1.getCountOperation());

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);
        result = calculator2.add(4.1, calculator2.add(calculator2.mult(15, 7), calculator2.pow(calculator2.div(28, 5), 2)));
        System.out.println("\nИспользуя Agregation с MathExtends");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator2.getCountOperation());

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);
        result = calculator3.add(4.1, calculator3.add(calculator3.mult(15, 7), calculator3.pow(calculator3.div(28, 5), 2)));
        System.out.println("\nИспользуя Agregation с WithOperator ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator3.getCountOperation());
    }
}

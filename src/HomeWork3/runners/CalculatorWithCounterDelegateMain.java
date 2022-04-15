package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite();

        double result =  result = calculator1.add(4.1, calculator1.add(calculator1.mult(15, 7), calculator1.pow(calculator1.div(28, 5), 2)));
        System.out.println("Используя Composite ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator1.getCountOperation());

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator2 = new CalculatorWithCounterAutoAgregation(calculatorWithMathCopy);
        result = calculator2.add(4.1, calculator2.add(calculator2.mult(15, 7), calculator2.pow(calculator2.div(28, 5), 2)));
        System.out.println("\nИспользуя Agregation с MathCopy ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator2.getCountOperation());

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoAgregation calculator3 = new CalculatorWithCounterAutoAgregation(calculatorWithMathExtends);
        result = calculator3.add(4.1, calculator3.add(calculator3.mult(15, 7), calculator3.pow(calculator3.div(28, 5), 2)));
        System.out.println("\nИспользуя Agregation с MathExtends");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator3.getCountOperation());

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregation calculator4 = new CalculatorWithCounterAutoAgregation(calculatorWithOperator);
        result = calculator4.add(4.1, calculator4.add(calculator4.mult(15, 7), calculator4.pow(calculator4.div(28, 5), 2)));
        System.out.println("\nИспользуя Agregation с WithOperator ");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество действий " + calculator2.getCountOperation());





    }
}

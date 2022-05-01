package HomeWork3;

import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW3Test {
    @Test
    public void ICalculatorTest() {

        ICalculator calculator1 = new CalculatorWithMathCopy();
        double result;
        double a;
        result = calculator1.div(28, 5);
        result = calculator1.pow(result, 2);
        a = calculator1.mult(15, 7);
        result = calculator1.add(a, result);
        result = calculator1.add(4.1, result);
        Assertions.assertEquals(result, 140.45999999999998);

        ICalculator calculator2 = new CalculatorWithMathExtends();
        result = calculator2.div(28, 5);
        result = calculator2.pow(result, 2);
        a = calculator2.mult(15, 7);
        result = calculator2.add(a, result);
        result = calculator2.add(4.1, result);
        Assertions.assertEquals(result, 140.45999999999998);

        ICalculator calculator3 = new CalculatorWithOperator();
        result = calculator3.div(28, 5);
        result = calculator3.pow(result, 2);
        a = calculator3.mult(15, 7);
        result = calculator3.add(a, result);
        result = calculator3.add(4.1, result);
        Assertions.assertEquals(result, 140.45999999999998);


    }
}

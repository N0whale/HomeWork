package HomeWork2;

import HomeWork2.arrays.DoWhileOperation;
import HomeWork2.arrays.ForEachOperation;
import HomeWork2.arrays.ForOperation;
import HomeWork2.arrays.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static HomeWork2.Utils.SortUtils.arraySortBubble;
import static HomeWork2.Utils.SortUtils.arraySortShaker;
import static HomeWork2.arrays.ArraysTasks.*;
import static HomeWork2.loops.loops_1_1_1.factorial;
import static HomeWork2.loops.loops_1_2.multiA;
import static HomeWork2.loops.loops_1_3.pow;
import static HomeWork2.loops.loops_1_4.congestion;

public class TestsHW2 {
    @Test
    public void loopsTestFactorial() {
        long a = 10;
        Assertions.assertEquals(factorial(a), "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800");
    }

    @Test
    public void loopTestMultiply() {
        int a = 875687;
        int b = 8 * 7 * 5 * 6 * 8 * 7;
        Assertions.assertEquals(multiA(a), b);
    }

    @Test
    public void powTest() {
        double a = 16.5;
        int b = 10;
        Assertions.assertEquals(pow(a, b), Math.pow(a, b));
    }

    @Test
    public void congestionTest() {
        long a = 145;
        long[] test = new long[]{8430435683716957185L, -3659921820296673279L};
        Assertions.assertEquals(test[0], congestion(a)[0]);
        Assertions.assertEquals(test[1], congestion(a)[1]);
    }

    @Test
    public void arraysTest() {
        int[] array = {64, 156, 984, 78, 46, 35, 12, 46, 98, 75};
        ForEachOperation forEach = new ForEachOperation();
        Assertions.assertEquals(forEach.arrayBackwards(array)[0], 75); //1 элемент в новом массиве, 1 с конца в исходном
        ForOperation forOperation = new ForOperation();
        Assertions.assertEquals(forOperation.arrayThroughOne(array)[2], 46); //проверка 3 элемента в новом массиве, 5 элемент в исходном
        WhileOperation whileOperation = new WhileOperation();
        Assertions.assertEquals(whileOperation.arrayBackwards(array)[4], 35); //5 элемент в новом массиве, 5 с конца в иходном
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        Assertions.assertEquals(doWhileOperation.arrayThroughOne(array)[4], 98);
    }

    @Test
    public void ArraysTasksTest() {
        int[] container = {46, 21, 46, 78, 4, 5, 94, 12, 35, 68, 48, 79, 45,};

        Assertions.assertEquals(arraySumPositiveEven(container), (46 + 46 + 78 + 4 + 94 + 12 + 68 + 48));   //Сумма четных положительных элементов

        Assertions.assertEquals(arrayMaxEven(container), 94);    //Максимальный четный элемент


        int avg = 0;
        for (int i : container) {
            avg += i;
        }
        avg /= container.length;

        Assertions.assertTrue(arrayLessThanAvg(container)[0] < avg);
        Assertions.assertTrue(arrayLessThanAvg(container)[1] < avg);

        Assertions.assertEquals(arrayTwoMin(container)[0], 4);
        Assertions.assertEquals(arrayTwoMin(container)[1], 5);

        Assertions.assertEquals(arraySumOfDigits(container), (4+6+2+1+4+6+7+8+4+5+9+4+1+2+3+5+6+8+4+8+7+9+4+5));
    }

    @Test
    public void sortUtilsTest(){
        int[] container = {13,64,7,8,49,99,56,465,13,24,34,65,97,87,54,6,5,158};
        System.out.println(Arrays.toString(arraySortShaker(container)));
        Assertions.assertEquals(arraySortShaker(container)[0], 5);
        Assertions.assertEquals(arraySortShaker(container)[arraySortShaker(container).length -1], 465);
        for (int i = 0; i < arraySortBubble(container).length-1; i++) {
            Assertions.assertTrue(arraySortBubble(container)[i] <= arraySortBubble(container)[i+1]);
        }


    }




}

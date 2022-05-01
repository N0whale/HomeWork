package HomeWork2.arrays;

import java.util.Arrays;

import static HomeWork2.Utils.ArraysUtils.arrayFromRandom;

public class ArraysIterationInterface {
    public static void main(String[] args) {
        int[] array = arrayFromRandom(10, 200);

        DoWhileOperation doWhile = new DoWhileOperation();
        System.out.println("\nИспользуя DoWhile");
        doWhile.arrayIntoConsole(array);
        System.out.println();
        System.out.println(Arrays.toString(doWhile.arrayThroughOne(array)));
        System.out.println(Arrays.toString(doWhile.arrayBackwards(array)));

        WhileOperation whileOperation = new WhileOperation();
        System.out.println("\nИспользуя While");
        whileOperation.arrayIntoConsole(array);
        System.out.println();
        System.out.println(Arrays.toString(whileOperation.arrayThroughOne(array)));
        System.out.println(Arrays.toString(whileOperation.arrayBackwards(array)));

        ForOperation forOperation = new ForOperation();
        System.out.println("\nИспользуя For");
        forOperation.arrayIntoConsole(array);
        System.out.println();
        System.out.println(Arrays.toString(forOperation.arrayThroughOne(array)));
        System.out.println(Arrays.toString(forOperation.arrayBackwards(array)));

        ForEachOperation forEach = new ForEachOperation();
        System.out.println("\nИспользуя ForEach");
        forEach.arrayIntoConsole(array);
        System.out.println();
        System.out.println(Arrays.toString(forEach.arrayThroughOne(array)));
        System.out.println(Arrays.toString(forEach.arrayBackwards(array)));



    }


}

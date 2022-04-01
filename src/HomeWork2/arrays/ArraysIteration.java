package HomeWork2.arrays;

import HomeWork2.Utils.ArraysUtils;

import java.util.Arrays;

public class ArraysIteration {

    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        arrayIntoConsole(container);
        arrayThroughOne(container);
        arrayBackwards(container);
    }

    public static void arrayIntoConsole(int[] array) {

        System.out.println("Вывод всех элементов в консоль");
        System.out.println("do..while");

        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);

        System.out.println("\nwhile");

        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println("\nfor");
        i = 0;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nforeach");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void arrayThroughOne(int[] array) {

        System.out.println("\nВыввод каждого второго элемента массива");
        System.out.println("do..while");

        int i = 1;

        do {
            System.out.print(array[i] + " ");
            i = i + 2;

        } while (i < array.length);

        System.out.println("\nwhile");

        i = 1;

        while (i < array.length) {

            System.out.print(array[i] + " ");

            i = i + 2;
        }

        System.out.println("\nfor");


        for (i = 1; i < array.length; i = i + 2) {

            System.out.print(array[i] + " ");
        }

        System.out.println("\nforeach");
        int z = 0;
        for (int a : array) {

            if (z % 2 != 0) {

                System.out.print(a + " ");
            }

            z++;

        }

    }


    public static void arrayBackwards(int[] array) {

        System.out.println("\nВывод элементов в обратном порядке");

        System.out.println("do..while");

        int i = array.length - 1;

        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);

        System.out.println("\nwhile");

        i = array.length - 1;

        while (i >= 0) {

            System.out.print(array[i] + " ");
            i--;
        }

        System.out.println("\nfor");

        for (i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }

        System.out.println("\nforeach");
        StringBuilder sb = new StringBuilder();
        for (int a : array) {
            sb.insert(0, a + " ");
        }
        System.out.println(sb.toString());
    }
}

package HomeWork2.Sorts;

import HomeWork2.Utils.ArraysUtils;
import HomeWork2.Utils.SortUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {

        int array1[] = {1,2,3,4,5,6};
        System.out.println("Массив до сортировки " + Arrays.toString(array1));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array1)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array1)));

        int array2[] = {1,1,1,1};
        System.out.println("\nМассив до сортировки " + Arrays.toString(array2));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array2)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array2)));

        int array3[] = {9,1,5,99,9,9};
        System.out.println("\nМассив до сортировки " + Arrays.toString(array3));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array3)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array3)));

        int array4[] = new int []{};
        System.out.println("\nМассив до сортировки " + Arrays.toString(array4));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array4)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array4)));

        int array5[] = {6,5,4,3,2,1};
        System.out.println("\nМассив до сортировки " + Arrays.toString(array5));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array5)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array5)));

        int array6[] = ArraysUtils.arrayFromRandom(50,100);
        System.out.println("\nМассив до сортировки " + Arrays.toString(array6));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array6)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array6)));

        int array7[] = ArraysUtils.arrayFromConsole();
        System.out.println("\nМассив до сортировки " + Arrays.toString(array7));
        System.out.println("После сортировки пузырьком " + Arrays.toString(SortUtils.arraySortBubble(array7)));
        System.out.println("После сортировки шейкером " + Arrays.toString(SortUtils.arraySortShaker(array7)));

    }
}

package HomeWork2.Utils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtils {
    public static void main(String[] args) {

        System.out.println("Массив со значениями из консоли" + Arrays.toString(arrayFromConsole()));

        System.out.println("Массив со случайными значениями" + Arrays.toString(arrayFromRandom(5, 100))) ;
    }

    public static int[] arrayFromConsole(){

        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = console.nextInt();

        int[] container = new int[a];

        for (int i = 0; i< container.length; i++) {
            System.out.println("Введите значение");
            container[i] = console.nextInt();
        }
        return container;

    }

    public static int[] arrayFromRandom(int size, int maxValueExclusion){

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int container[] = new int [size];
        for (int i =0; i < size; i++) {
            int random = rnd.nextInt(0, maxValueExclusion);
            container[i] = random;
        }
        return container;
    }
}

package HomeWork2.arrays;

import HomeWork2.Utils.ArraysUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysTasks {

    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromRandom(50, 100);

        System.out.println("Полученный массив ");
        System.out.println(Arrays.toString(container));

        System.out.println("Сумма четных положительных элементов");
        System.out.println(arraySumPositiveEven(container));

        System.out.println("Максимальный четный элемент ");
        System.out.println(arrayMaxEven(container));

        System.out.println("Элементы, которые меньше среднего арифметического ");
        arrayLessThanAvg(container);

        System.out.println();
        System.out.println("Два наименьших элементов массива");
        arrayTwoMin(container);

        System.out.println("Сжатый массив с удаленными элементами в заданном интервале");
        System.out.println(Arrays.toString(arrayRemoveFromInterval(container, 20, 40)));

        System.out.println("Сумма цифр элементов массива");
        System.out.println(arraySumOfDigits(container));

    }

    /**
     * метод считает сумму четных положительных элементов массива
     *
     * @param array массив
     * @return возвращает сумму четных положительных элементов
     */
    public static int arraySumPositiveEven(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    /**
     * метод выбирает максимальный четный элемент из массива
     *
     * @param array массив
     * @return возвращает максимальное четное значение
     */
    public static int arrayMaxEven(int[] array) {

        int max = array[0];

        for (int a : array) {
            if (a > max && a % 2 == 0) {
                max = a;
            }
        }
        return max;
    }

    /**
     * метод выводит элементы массива, которые меньше среднего арифметического всех элементов
     *
     * @param array массив
     */
    public static void arrayLessThanAvg(int[] array) {

        int avg = 0;

        for (int i = 0; i < array.length; i++) {      //в этом цикле считаем среднее арифметического
            avg += array[i];
        }
        avg /= array.length;

        for (int j : array) {              //в этом цикле записываем элементы, которые меньше среднего арифметического
            if (j < avg) {
                System.out.print(j + " ");
            }
        }
    }

    /**
     * метод выводит 2 наименьших значения в массиве
     *
     * @param array массив
     */
    public static void arrayTwoMin(int[] array) {

        int a = array[0];                            //назначил 2 переменные первым двум элементам массива

        int b = array[1];

        int tmp, c = 0;

        if (a < b) {                                 //если первый элемент меньше второго, меняю значения местами, чтобы потом не потерять при проверке первый
            tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = 2; i < array.length; i++) {                //циклом нахожу минимальный элемент и его индекс

            if (a >= array[i]) {
                a = array[i];
                c = i;
            }

        }
        for (int i = 2; i < array.length; i++) {               //вторым циклом нахожу опять минимальный, но значение с индексом из предыдущего цикла игнорируется
            if (b >= array[i] && c != i) {
                b = array[i];
            }
        }

        System.out.println(a + " " + b);
    }

    /**
     * метод удаляет элементы из заданного интервала, смещает влево те, что лежат правее интервала и записывает все в новый массив
     *
     * @param array массив
     * @param a     от какого элемента удалить
     * @param b     до какого элемента удалить
     * @return второй массив, в который записаны нужные элементы первого
     */
    public static int[] arrayRemoveFromInterval(int[] array, int a, int b) {

        int[] array2 = new int[array.length];

        for (int i = 0; i < a; i++) {
            array2[i] = array[i];
        }
        for (int i = b + 1; i > b & i < array.length; i++) {
            array2[a] = array[i];
            a++;
        }
        return array2;
    }

    /**
     * Метод находит сумму цифр всех элементов массива
     *
     * @param array массив
     * @return сумму цифр элементов массива
     */
    public static int arraySumOfDigits(int[] array) {

        int a, b, c = 0;

        for (int i = 0; i < array.length; i++) {
            a = array[i];
            while (a > 0) {
                b = a % 10;
                c += b;
                a /= 10;
            }
        }
        return c;

    }

}

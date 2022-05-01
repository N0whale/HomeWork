package HomeWork2.Utils;

public class SortUtils {

    public static int[] arraySortBubble(int[] array) {

        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        } return array;
    }

    public static int[] arraySortShaker(int[] array) {
        boolean wasSorted = true;
        int left = 0, right = array.length - 1, temp;
        while (left < right && wasSorted){
            wasSorted = false;
            for (int i = left; i < right; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    wasSorted = true;
                }
            } right--;
            for (int i = right; i > left; i--) {
                if (array[i-1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    wasSorted = true;
                }
            } left++;
        } return array;
    }
}

package HomeWork2.arrays;

public class WhileOperation implements IArraysOperation {

    @Override
    public void arrayIntoConsole(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }

    @Override
    public int[] arrayThroughOne(int[] array) {
        int i = 0;
        int j = 0;
        int[] container = new int[(array.length + 1) / 2];
        while (i < array.length) {
            container[j] = array[i];
            j++;
            i = i + 2;
        }
        return container;
    }

    @Override
    public int[] arrayBackwards(int[] array) {
        int i = array.length - 1;
        int j = 0;
        int[] container = new int[array.length];
        while (i >= 0) {
            container[j] = array[i];
            i--;
            j++;
        }
        return container;
    }
}

package HomeWork2.arrays;

public class DoWhileOperation implements IArraysOperation{

    @Override
    public void arrayIntoConsole(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
    }

    @Override
    public int[] arrayThroughOne(int[] array) {
        int i = 0;
        int j = 0;
        int[] container = new int[(array.length + 1) / 2];
        do {
            container[j] = array[i];
            j++;
            i = i + 2;
        } while (i < array.length);
        return container;
    }

    @Override
    public int[] arrayBackwards(int[] array) {
        int i = array.length - 1;
        int j = 0;
        int[] container = new int[array.length];
        do {
            container[j] = array[i];
            i--;
            j++;
        } while (i >= 0);
        return container;
    }
}

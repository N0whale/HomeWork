package HomeWork2.arrays;

public class ForOperation implements IArraysOperation{
    @Override
    public void arrayIntoConsole(int[] array) {
        int i = 0;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public int[] arrayThroughOne(int[] array) {
        int j = 0;
        int[] container = new int[(array.length + 1) / 2];
        for (int i = 0; i < array.length; i = i + 2) {
            container[j] = array[i];
            j++;
        } return container;
    }

    @Override
    public int[] arrayBackwards(int[] array) {
        int j = 0;
        int[] container = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--){
            container[j] = array[i];
            j++;
        } return container;
    }
}

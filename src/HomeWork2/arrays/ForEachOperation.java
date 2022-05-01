package HomeWork2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void arrayIntoConsole(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    @Override
    public int[] arrayThroughOne(int[] array) {
        int j = 0;
        int count = 0;
        int[] container = new int[(array.length + 1) / 2];
        for (int i : array) {
            if (count % 2 == 0) {
                container[j] = i;
                j++;
            }
            count++;
        }
        return container;
    }

    @Override
    public int[] arrayBackwards(int[] array) {
        int j = array.length - 1;
        int[] container = new int[array.length];
        for (int i : array) {
            container[j] = i;
            j--;
        }
        return container;
    }
}

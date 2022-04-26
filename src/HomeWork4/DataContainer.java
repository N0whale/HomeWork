package HomeWork4;

import HomeWork2.Utils.ArraysUtils;

import java.util.*;


public class DataContainer<T> {

    public T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Переопределенный метод toString
     * @return
     */
    @Override
    public String toString() {
        List<T> dataArray = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null){
                dataArray.add(data[i]);
            }
        }
        return "DataContainer= "
                + dataArray;
    }




    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        this.data = createNewArray(item);
        return data.length;
    }




    private T[] createNewArray(T item) {
        T[] newArray = Arrays.copyOf(this.data, data.length + 1);
        newArray[newArray.length - 1] = item;
        return newArray;
    }

    /**
     * метод получения поля из data
     *
     * @param index
     * @return
     */
    public T get(int index) {
        if (index < 0) {
            return null;
        } else if (index < data.length) {
            return data[index];
        } else {
            return null;
        }
    }

    public T[] getItems(T item){
       return this.data;             //TODO
    }

    /**
     * метод удаления поля по индексу
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index >= data.length) {
            return false;
        } else if (data[index] == null) {
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            this.data = Arrays.copyOf(this.data, data.length - 1);
            return true;
        }
    }

    /**
     * метод удаления поля по значению
     * @param item
     * @return
     */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort (Comparator<T> comparator){ //TODO

    }

}








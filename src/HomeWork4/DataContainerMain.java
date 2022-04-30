package HomeWork4;


public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[]{});

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела


        DataContainer<Integer> data = new DataContainer<>(new Integer[]{5, null, null, 4, 654});
        System.out.println();
        System.out.println(data);
        data.add(246);
        System.out.println("Добавили в первый null 246");
        System.out.println(data);
        System.out.println();
        System.out.println("получаем элемент из 0 индекса" + data.get(0));
        Integer a = 654;
        data.delete(a);
        System.out.println("Удалили элемент 654");
        System.out.println(data);
    }
}

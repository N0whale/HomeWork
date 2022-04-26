package HomeWork4;


import Students.Student;

public class DataContainerMain {
    public static void main(String[] args) {

       DataContainer<Integer> data = new DataContainer<>(new Integer[]{5,null,null, 4, 654 });



       data.add(246);
       System.out.println(data);
        System.out.println();
        System.out.println(data.get(0));
        Integer a = 654;
        data.delete(a);
        System.out.println(data);








    }
}

package HomeWork2.loops;

import java.util.Scanner;

public class loops_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        long a = in.nextLong();
        System.out.println("До переполнения " + congestion(a)[0]);
        System.out.println("После переполнения" + congestion(a)[1]);
    }

    public static long[] congestion(long a){
        long[] result = {0,a};
        if (a == 0 || a == 1){
            System.out.println("нужно число отличное от 0 или 1");
            return result;
        }
        if (a > 0){
            do {
                result[0] = result[1];
                result[1] *= result[1];
            } while (result[1] > 0);
            return result;
        } else
            do {
                result[0] = result[1];
                result[1] *= result[1];
            } while (result[1] < 0);
            return  result;
    }
}

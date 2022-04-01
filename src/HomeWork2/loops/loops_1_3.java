package HomeWork2.loops;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class loops_1_3 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число");
        double a = console.nextDouble();

        System.out.println("Введите второе число");
        if (!console.hasNextInt()) {
            System.out.println("Введите целое положительное число");
        }
        int b = console.nextInt();
        if (b < 0) {
            System.out.println("Введите целое положительное число");
        } else
            System.out.println(a + " ^ " + b + " = " + stepen(a, b));
    }

    public static double stepen(double a, int b) {
        double c = 1;

        for (int i = 1; i < b; i++) {
            c *= a;
        }
        return c;
    }
}



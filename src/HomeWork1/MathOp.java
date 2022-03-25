package HomeWork1;

import java.util.Scanner;

public class MathOp {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите число");

        double a = console.nextDouble();

        System.out.println("Введите еще одно число");

        double b = console.nextDouble();

        System.out.println("Меньшее из двух чисел " + Math.min(a,b));

        System.out.println("Квадратные корни чисел равны " + Math.sqrt(a)  + " и  " + Math.sqrt(b));

        System.out.println("Первое число в степени второго равно " + Math.pow(a,b));

        System.out.println(" Кубические корни чисел равны" + Math.cbrt(a)  + " и  " + Math.cbrt(b) );

        System.out.println("Арксинус первого значения " + Math.asin(a) );

        System.out.println(("Арктангенс второго значения " + Math.atan(b)));
    }
}

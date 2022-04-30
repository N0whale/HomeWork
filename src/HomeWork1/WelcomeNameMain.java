package HomeWork1;

import java.util.Scanner;

public class WelcomeNameMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        WelcomeIf welcomeIf = new WelcomeIf();
        System.out.println("Введите имя");
        System.out.println("Решение с помощью IF\n" + welcomeIf.welcome(in.nextLine()));

        WelcomeIfElse welcomeIfElse = new WelcomeIfElse();
        System.out.println("Введите имя");
        System.out.println("Решение с помощью IF ELSE\n" + welcomeIfElse.welcome(in.nextLine()));

        WelcomeSwitch welcomeSwitch = new WelcomeSwitch();
        System.out.println("Введите имя");
        System.out.println("Решение с помощью SWITCH\n" + welcomeSwitch.welcome(in.nextLine()));
    }
}

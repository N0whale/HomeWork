package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class SleepIf {
    public static void main(String[] args) {


        Scanner Sleep = new Scanner(System.in);

        System.out.println("Сегодня рабочий день? (true/false)");

        boolean weekday = Sleep.nextBoolean();

        System.out.println("Сегодня отпуск? (true/false)");

        boolean vacation = Sleep.nextBoolean();

        if (!weekday || vacation) {
            System.out.println(true);
            System.out.println("можем спать дальше");
        } else {
            System.out.println(false);
            System.out.println("Пора идти на работу");
        }


    }
}



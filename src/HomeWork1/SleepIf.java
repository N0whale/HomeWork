package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class SleepIf {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = false;

        System.out.println(sleepDecision(sleepIn(weekday,vacation)));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static String sleepDecision(boolean a){
        if (a){
            return "Можем спать дальше";
        } else return "Пора на работу";
    }

}



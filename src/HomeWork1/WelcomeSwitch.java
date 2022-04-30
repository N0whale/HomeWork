package HomeWork1;

import java.util.Scanner;

public class WelcomeSwitch implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        switch (name) {
            case "Вася":
                return "Привет!\nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а Вы, собственно говоря кто?";
        }
    }
}
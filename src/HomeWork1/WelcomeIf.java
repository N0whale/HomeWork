package HomeWork1;

import java.util.Objects;

public class WelcomeIf implements ICommunicationPrinter{

    public String welcome(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Привет,\nЯ тебя так долго ждал";
        }
        if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а Вы, собственно говоря кто?";
    }
}
package HomeWork1;

import java.util.Objects;

public class WelcomeIfElse implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        } else if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        } else return "Добрый день, а Вы, собственно говоря кто?";
    }
}
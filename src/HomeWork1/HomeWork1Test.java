package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static HomeWork1.CreatePhoneNumber.phoneNumber;
import static HomeWork1.SleepIf.sleepDecision;


public class HomeWork1Test {

    @Test
    public void sleepResult(){
        boolean sleep = true;
        Assertions.assertEquals(sleepDecision(sleep), "Можем спать дальше");
        sleep = false;
        Assertions.assertEquals(sleepDecision(sleep), "Пора на работу");
    }

    @Test
    public void welcomeIfTest(){
        String name = "Вася";
        WelcomeIf welcomeIf = new WelcomeIf();
        Assertions.assertEquals(welcomeIf.welcome(name), "Привет,\nЯ тебя так долго ждал");
        name = "Анастасия";
        Assertions.assertEquals(welcomeIf.welcome(name), "Я тебя так долго ждал");
        name = "Криштиано Роналду";
        Assertions.assertEquals(welcomeIf.welcome(name), "Добрый день, а Вы, собственно говоря кто?");
    }

    @Test
    public void welcomeIfElseTest(){
        String name = "Вася";
        WelcomeIfElse welcomeIfElse = new WelcomeIfElse();
        Assertions.assertEquals(welcomeIfElse.welcome(name), "Привет,\nЯ тебя так долго ждал");
        name = "Анастасия";
        Assertions.assertEquals(welcomeIfElse.welcome(name), "Я тебя так долго ждал");
        name = "Криштиано Роналду";
        Assertions.assertEquals(welcomeIfElse.welcome(name), "Добрый день, а Вы, собственно говоря кто?");
    }

    @Test
    public void welcomeSwitchTest(){
        String name = "Вася";
        WelcomeSwitch welcomeSwitch= new WelcomeSwitch();
        Assertions.assertEquals(welcomeSwitch.welcome(name), "Привет,\nЯ тебя так долго ждал");
        name = "Анастасия";
        Assertions.assertEquals(welcomeSwitch.welcome(name), "Я тебя так долго ждал");
        name = "Криштиано Роналду";
        Assertions.assertEquals(welcomeSwitch.welcome(name), "Добрый день, а Вы, собственно говоря кто?");
    }

    @Test
    public void phoneNumberTest(){
        int[] array = {9, 2, 3, 4, 0, 4, 7, 6, 9, 1};
        Assertions.assertEquals(phoneNumber(array),"(923)404-7691" );
    }





}

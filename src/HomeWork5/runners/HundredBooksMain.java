package HomeWork5.runners;


import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Scanner;
import static HomeWork5.WorkWithBooks.HundredBooksMethods.*;

public class HundredBooksMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес папки");
        String path = console.nextLine();
        listOfFiles(path);
        String yesOrNo;
        do {System.out.println("Выберите книгу");
            String choiceBook = console.nextLine();
            System.out.println("Выберите слово, которое надо найти");
            String choiceWord = console.nextLine();
            try {
                if (amountOfWords(path, choiceBook, choiceWord) < 0){
                    System.out.println("Неверный путь к файлу");
            }
            } catch (IOException e) {
                System.out.println("Неверный путь к файлу");
            }
            try {
                writeResult(choiceBook,choiceWord,amountOfWords(path,choiceBook,choiceWord));
            } catch (IOException e) {
                System.out.println("Неверный путь к файлу");
            }
            System.out.println("Если хотите продолжить, напишите 'выход', для продолжения введите, что угодно");
            yesOrNo = console.nextLine();
        } while (!yesOrNo.equalsIgnoreCase("выход"));
    }
}
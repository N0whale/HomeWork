package HomeWork5.runners;



import java.io.*;


import static HomeWork5.WarAndPeaceCollections.WarCollections.NumberOfWords;
import static HomeWork5.WarAndPeaceCollections.WarCollections.SortedTopUsedWords;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        String path = "C:/Users/gross/Downloads/Война и мир_книга.txt";
        try{
            System.out.println(NumberOfWords(path));
        } catch (IOException exception) {
            System.out.println("Файл не найден");
        }

        try {
            System.out.println(SortedTopUsedWords(50,path));
        } catch (IOException e){
            System.out.println("Файл не найден");
        }
    }
}

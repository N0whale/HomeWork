package HomeWork5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static HomeWork5.WarCollections.NumberOfWords;
import static HomeWork5.WarCollections.SortedTopUsedWords;

public class WarAndPeaceMain {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/gross/Downloads/Война и мир_книга.txt";
        try{
            System.out.println(NumberOfWords(path));
        } catch (IOException exception) {
            System.out.println("Неправильный путь к файлу");
        }

        try {
            System.out.println(SortedTopUsedWords(50,path));
        } catch (IOException e){
            System.out.println("говно");
        }
        String strLine = Files.readString(Path.of(path));
        ISearchEngine searchEngine = new EasySearch();
        System.out.println(searchEngine.search(strLine,"Андрей"));

    }



}

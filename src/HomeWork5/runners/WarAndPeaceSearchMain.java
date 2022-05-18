package HomeWork5.runners;

import HomeWork5.Inteface.ISearchEngine;
import HomeWork5.Searchers.EasySearch;
import HomeWork5.Searchers.RegExSearch;
import HomeWork5.Searchers.SearchEnginePunctuationNormalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static HomeWork5.Searchers.SearchEnginePunctuationNormalizer.normalizer;

public class WarAndPeaceSearchMain {
    public static void main(String[] args) {
        String path = "C:/Users/gross/Downloads/Война и мир_книга.txt";
        ISearchEngine easySearch = new EasySearch();
        try {
            String strLine = Files.readString(Path.of(path));
            System.out.println("Используя EasySearch");
            System.out.println("Количество слов 'война' " + easySearch.search(strLine, "война"));
            System.out.println("Количество слов 'и' " + easySearch.search(strLine, "и"));
            System.out.println("Количество слов 'мир' " + easySearch.search(strLine, "мир"));
        } catch (IOException e){
            System.out.println("Файл не найден");
        }

        ISearchEngine regExSearch = new RegExSearch();
        try {
            String strLine = Files.readString(Path.of(path));
            System.out.println("Используя RegExSearch");
            System.out.println("Количество слов 'война' " + regExSearch.search(strLine, "война"));
            System.out.println("Количество слов 'и' " + regExSearch.search(strLine, "и"));
            System.out.println("Количество слов 'мир' " + regExSearch.search(strLine, "мир"));
        } catch (IOException e){
            System.out.println("Файл не найден");
        }

        ISearchEngine punctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
        try {
            String strLine = Files.readString(Path.of(path));
            System.out.println("Используя punctuationNormalizer");
            System.out.println("Количество слов 'война' " + punctuationNormalizer.search(strLine, "война"));
            System.out.println("Количество слов 'и' " + punctuationNormalizer.search(strLine, "и"));
            System.out.println("Количество слов 'мир' " + punctuationNormalizer.search(strLine, "мир"));
        } catch (IOException e){
            System.out.println("Файл не найден");
        }
    }
}

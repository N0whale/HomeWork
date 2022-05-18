package HomeWork5.WorkWithBooks;

import HomeWork5.Inteface.ISearchEngine;
import HomeWork5.Searchers.EasySearch;

import javax.xml.transform.Result;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static HomeWork5.WarAndPeaceCollections.WarCollections.convertFileIntoString;

public class HundredBooksMethods {
    public static void listOfFiles(String path) {
        File file = new File(path);
        File[] listOfFiles = file.listFiles();
        for (File f : listOfFiles) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }

    public static long amountOfWords(String path, String fileName, String word) throws IOException {
        ISearchEngine search = new EasySearch();
        String newAddress = path + '/' + fileName;
        File newFile = new File(newAddress);
        if (newFile.exists()) {
            return search.search(convertFileIntoString(newAddress), word);
        } else return -1;
    }

    public static void writeResult(String file, String word, long number)
            throws IOException {
        if (number > -1) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("d:/Книги/Result.txt", true));
            writer.append(file).append(" - ").append(word).append(" - ").append(String.valueOf(number)).append("\n");
            writer.close();
        }
    }
}


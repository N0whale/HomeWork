package HomeWork5.WarAndPeaceCollections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;



public class WarCollections {
    public static int NumberOfWords(String path) throws IOException {
        String strLine = Files.readString(Path.of(path));
        String[] words = strLine.split("[)(\"'\\s*|,?!;:.@=-{2,}]+");
        Set<String> allWords = new HashSet<>(Arrays.asList(words));
        return allWords.size();
    }

    public static ArrayList SortedTopUsedWords(int number, String path) throws IOException {
        String strLine = Files.readString(Path.of(path));
        String[] words = strLine.split("[)(\"'\\s*|,?!;:.@=[-{2,}]]+");
        Map<String, Integer> map = new HashMap<>();
        for (String allWord : words) {
            map.merge(allWord, 1, Integer::sum);
        }
        List<Map.Entry<String, Integer>> valuesList = new ArrayList(map.entrySet());
        Collections.sort(valuesList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        ArrayList finalList = new ArrayList();
        for (int i = 0; i < number; i++) {
            finalList.add(valuesList.get(i));
        }
        return finalList;
    }
    public static String convertFileIntoString(String path) throws IOException {
        return Files.readString(Path.of(path));
    }
}



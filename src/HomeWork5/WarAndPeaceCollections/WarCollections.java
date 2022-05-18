package HomeWork5.WarAndPeaceCollections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;



public class WarCollections {
    /**
     * метод делает строку из файл по переданному адресу, после этого делает массив строк и помещает их в сет.
     * возвращает размер сета
     * @param path путь к файлу
     * @return размер сета
     * @throws IOException
     */
    public static int NumberOfWords(String path) throws IOException {
        String strLine = Files.readString(Path.of(path));
        String[] words = strLine.split("[)(\"'\\s*|,?!;:.@=-{2,}]+");
        Set<String> allWords = new HashSet<>(Arrays.asList(words));
        return allWords.size();
    }

    /**
     * метод создает map из слов в тексе файла, где Key - это слово, а Value - это количество использований в тексте
     * После этого помещаем это в List и сортируем по Value от большего к меньшему
     * Далее создает новый лист куда помещает определенное количество первых элементов. нужное количество передано в метод в параметре number
     * @param number нужное количество отбражений
     * @param path путь к файлу
     * @return List значений
     * @throws IOException
     */
    public static String SortedTopUsedWords(int number, String path) throws IOException {
        String strLine = Files.readString(Path.of(path));
        String[] words = strLine.split("[)(\"'\\s*|,?!;:.@=[-{2,}]]+");
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String allWord : words) {
            map.merge(allWord, 1, Integer::sum);
        }
        List<Map.Entry<String, Integer>> valuesList = new ArrayList(map.entrySet());
        Collections.sort(valuesList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        ArrayList<Map.Entry<String, Integer>> finalList = new ArrayList();
        for (int i = 0; i < number; i++) {
            finalList.add(valuesList.get(i));
        }
        for (Map.Entry<String, Integer> element : finalList) {
            sb.append(element.getKey()).append(" - ").append(element.getValue()).append(" раз // ");

        } return sb.toString();
    }

    public static String convertFileIntoString(String path) throws IOException {
        return Files.readString(Path.of(path));
    }


}



package HomeWork5.Searchers;

import HomeWork5.Inteface.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * поисковик, который ищет слова, у которых спереди и сзади пробелы
     * @param text текст, в котором ищем
     * @param word слово, которое ищем
     * @return количество слов в тексте
     */
    public long search(String text, String word) {
        long a = 0;
        int from = 0;
        char space = ' ';
        while (text.indexOf(word, from) != -1) {
            from = text.indexOf(word, from) + word.length();
            if (text.charAt(from + 1) == space && text.charAt(from - word.length()-1) == space) {
                a += 1;
            }
        }
        return a;
    }
}

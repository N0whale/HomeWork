package HomeWork5.Searchers;

import HomeWork5.Inteface.ISearchEngine;

public class EasySearch implements ISearchEngine {

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

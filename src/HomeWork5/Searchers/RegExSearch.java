package HomeWork5.Searchers;

import HomeWork5.Inteface.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     * метод ищет слова, окруженные любыми символами
     * @param text переданный текст
     * @param word слово, которое ищем
     * @return количество слов в тексте
     */
    @Override
    public long search(String text, String word) {
        Pattern p = Pattern.compile("\\b" + word + "\\b");
        Matcher m = p.matcher(text);
        long count = 0;
        while(m.find()){
            count++;
        }
        return count;
    }
}

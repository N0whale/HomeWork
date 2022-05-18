package HomeWork5.Searchers;

import HomeWork5.Inteface.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * метод считает количество использований слова в тексте. Текст форматируется методом normalizer
     * @param text изначальный текст
     * @param word искомое слово
     * @return количество использований слова в тексте
     */
    @Override
    public long search(String text, String word) {
        normalizer(text);
        return this.searchEngine.search(text,word);
    }

    /**
     * удаляет все нежелательные знаки из текста
     * @param text изначальный текст
     * @return отформатированный текст
     */
    public static String normalizer(String text){
        text = text.replaceAll("[^а-яА-Я0-9.,!?:-]", " ").replaceAll("-{2,}", "-");
        return text;
    }
}

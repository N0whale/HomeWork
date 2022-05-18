package HomeWork5.Searchers;

import HomeWork5.Inteface.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }


    @Override
    public long search(String text, String word) {
        normalizer(text);
        return this.searchEngine.search(text,word);
    }

    public static String normalizer(String text){
        text = text.replaceAll("[^а-яА-Я0-9.,!?:-]", " ").replaceAll("-{2,}", "-");
        return text;
    }
}

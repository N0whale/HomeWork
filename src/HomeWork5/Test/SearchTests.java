package HomeWork5.Test;

import HomeWork5.Inteface.ISearchEngine;
import HomeWork5.Searchers.EasySearch;
import HomeWork5.Searchers.RegExSearch;
import HomeWork5.Searchers.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static HomeWork5.WarAndPeaceCollections.WarCollections.NumberOfWords;

public class SearchTests {
    @Test
    public void regExSearch() throws IOException {
        String str1 = "привет, как дела!"; // - тут три слова "привет", "как", "дела";
        String str2 = "привет,какдела!"; //- тут два слова "привет", "какдела";
        String str3 = "привет;какдела!"; //- тут два слова "привет", "какдела";
        String str4 = "как дела!.Что делаешь?"; //- тут четыре слова "как", "дела", "Что", "делаешь";
        String str5 = "Привет-привет"; //- тут одно слово "Привет-привет";
        String str6 = "Привет -привет"; //- тут два слова "Привет", "привет";
        String str7 = "4-х"; //- тут одно слово "4-х";
        String str8 = "один и 1"; //- тут три слова "один", "и", "1"
        String str9 = "бабушка бабушке бабушку"; //- тут три слова "бабушка", "бабушке", "бабушку"
        String str10 = "Паровозик Томас";
        String str11 = "Я+в:? своём ;%познании_+ настолько/ преисполнился, что= я /как будто бы уже 100 ++триллионов/ миллиардов лет" +
                " проживаю на +-триллионах/+ и +/трилли+онах-+ таких же планет, понимаешь?";
        ISearchEngine regExSearch = new RegExSearch();
        Assertions.assertEquals(regExSearch.search(str1, "привет"), 1);
        Assertions.assertEquals(regExSearch.search(str2, "какдела"), 1);
        Assertions.assertEquals(regExSearch.search(str3, "какдела"), 1);
        Assertions.assertEquals(regExSearch.search(str4, "Что"), 1);
        Assertions.assertEquals(regExSearch.search(str5, "Привет-привет"), 1);
        Assertions.assertEquals(regExSearch.search(str6, "привет"), 1);
        Assertions.assertEquals(regExSearch.search(str7, "4-х"), 1);
        Assertions.assertEquals(regExSearch.search(str8, "один"), 1);
        Assertions.assertEquals(regExSearch.search(str9, "бабушка"), 1);
        Assertions.assertEquals(regExSearch.search(str10, "возик"), 0);
        Assertions.assertEquals(regExSearch.search(str11, "триллионах"), 1);
        Assertions.assertEquals(regExSearch.search(str11, "триллион"), 0);
    }
    @Test
    public void SearchPunctuationNormalizer(){
        String str1 = "привет, как дела!"; // - тут три слова "привет", "как", "дела";
        String str2 = "привет,какдела!"; //- тут два слова "привет", "какдела";
        String str3 = "привет;какдела!"; //- тут два слова "привет", "какдела";
        String str4 = "как дела!.Что делаешь?"; //- тут четыре слова "как", "дела", "Что", "делаешь";
        String str5 = "Привет-привет"; //- тут одно слово "Привет-привет";
        String str6 = "Привет -привет"; //- тут два слова "Привет", "привет";
        String str7 = "4-х"; //- тут одно слово "4-х";
        String str8 = "один и 1"; //- тут три слова "один", "и", "1"
        String str9 = "бабушка бабушке бабушку"; //- тут три слова "бабушка", "бабушке", "бабушку"
        String str10 = "Паровозик Томас";
        String str11 = "Я+в:? своём ;%познании_+ настолько/ преисполнился, что= я /как будто бы уже 100 ++триллионов/ миллиардов лет" +
                " проживаю на +-триллионах/+ и +/трилли+онах-+ таких же планет, понимаешь?";
        ISearchEngine regExSearch = new RegExSearch();
        ISearchEngine punctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
        Assertions.assertEquals(punctuationNormalizer.search(str1, "привет"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str2, "какдела"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str3, "какдела"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str4, "Что"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str5, "Привет-привет"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str6, "привет"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str7, "4-х"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str8, "один"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str9, "бабушка"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str10, "возик"), 0);
        Assertions.assertEquals(punctuationNormalizer.search(str11, "триллионах"), 1);
        Assertions.assertEquals(punctuationNormalizer.search(str11, "триллион"), 0);
    }
}

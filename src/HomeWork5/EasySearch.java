package HomeWork5;

public class EasySearch implements ISearchEngine {

    public long search(String text, String word) {
        long a = 0;
        int from = 0;
        int index = 0;
//        while (from <= text.length()) {
//            index = from;
//            from = text.indexOf(word, from);
//            if (from > index) {
//                from += word.length();
//                a += 1;
//            } else return a;
//        } return a;
        while (text.indexOf(word,from) != -1){
            from = text.indexOf(word,from) + word.length();
            a += 1;
        }
        return a;
    }
}

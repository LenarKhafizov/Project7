import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        Set<String> wordsSet = new HashSet<>();
        for (String wordFromText : words) {
            wordsSet.add(wordFromText.toLowerCase());
        }
        return wordsSet.contains(word.toLowerCase());
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание. Коллекции HashSet и HashMap.");
        String text = Text.text();
        WordsChecker wordsChecker = new WordsChecker(text);
        String word = "Incididunt";
        if (wordsChecker.hasWord(word)) {
            System.out.println("Текст содержит искомое слово: " + word);
        } else {
            System.out.println("Текст не содержит искомое слово: " + word);
        }
    }
}
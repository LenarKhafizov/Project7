package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    WordsChecker wordsChecker = new WordsChecker("Тестирование программы.");

    @Test
    public void testConstructor() {
        Assertions.assertNotNull(wordsChecker);
    }
    @Test
    public void testHasWordTrue() {
        Assertions.assertTrue(wordsChecker.hasWord("Тестирование"));
    }
    @Test
    public void testHasWordFalse() {
        Assertions.assertFalse(wordsChecker.hasWord("Тест"));
    }


}

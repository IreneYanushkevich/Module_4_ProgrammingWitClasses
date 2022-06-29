package by.epam.yanushkevich_irina.module4.task2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    final private List<Word> words;

    {
        words = new ArrayList<>();
    }

    public Sentence() {
    }

    public void addSentence(Word word) {
        words.add(word);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Word word : words) {
            result.append(word);
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sentence sen = (Sentence) obj;
        return words.equals(sen.words);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime * Objects.hash(words);
    }
}

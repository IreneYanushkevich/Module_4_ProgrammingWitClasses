package by.epam.yanushkevich_irina.module4.task2_1;

import java.util.List;
import java.util.Objects;

public class Word {

    final private String word;


    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word + " ";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime * Objects.hash(word);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word w = (Word) obj;
        if (word == null) {
            return w.word == null;
        } else return word.equals(w.word);
    }
}

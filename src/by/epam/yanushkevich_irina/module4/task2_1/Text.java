package by.epam.yanushkevich_irina.module4.task2_1;

import java.util.ArrayList;
import java.util.List;

public class Text {

    final private List<Sentence> sentences;
    final private Word title;

    {
        sentences = new ArrayList<>();
    }

    public Text(Word title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(title.toString() + "\n");
        for (Sentence value : sentences) {
            result.append(value);
        }
        return result.toString();
    }

    public void printText() {
        System.out.println("\nText:\n" + this);
    }

    public void addText(Sentence sentence) {
        sentences.add(sentence);
    }

    public void printTitle() {
        System.out.println("\nTitle is '" + title + "\b'");
    }
}

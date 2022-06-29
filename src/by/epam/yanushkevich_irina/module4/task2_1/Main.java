package by.epam.yanushkevich_irina.module4.task2_1;

public class Main {

    /*  1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
           консоль текст, заголовок текста.  */

    public static void main(String[] args) {

        Word word = new Word("Anecdote");

        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Sentence sentence3 = new Sentence();

        sentence1.addSentence(new Word("Chukchi"));
        sentence1.addSentence(new Word("bought"));
        sentence1.addSentence(new Word("a"));
        sentence1.addSentence(new Word("refrigerator."));
        sentence2.addSentence(new Word("\n-What"));
        sentence2.addSentence(new Word("do"));
        sentence2.addSentence(new Word("you"));
        sentence2.addSentence(new Word("need"));
        sentence2.addSentence(new Word("this"));
        sentence2.addSentence(new Word("fridge"));
        sentence2.addSentence(new Word("for?"));
        sentence3.addSentence(new Word("\n-Bask:"));
        sentence3.addSentence(new Word("it"));
        sentence3.addSentence(new Word("is"));
        sentence3.addSentence(new Word("-40"));
        sentence3.addSentence(new Word("outside"));
        sentence3.addSentence(new Word("and"));
        sentence3.addSentence(new Word("+4"));
        sentence3.addSentence(new Word("inside."));

        Text text = new Text(word);

        text.addText(sentence1);
        text.addText(sentence2);
        text.addText(sentence3);
        text.printText();
        text.printTitle();
    }
}

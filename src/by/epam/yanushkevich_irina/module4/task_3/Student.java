package by.epam.yanushkevich_irina.module4.task_3;

import java.util.Arrays;

public class Student {

    private String name;
    private int group;
    private int[] progress;

    public Student(String name, int group, int[] progress) {
        this.name = name;
        this.group = group;
        this.progress = progress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    public int[] getProgress() {
        return progress;
    }

    @Override
    public String toString() {
        return name + " gr.N" + group + " marks: " + Arrays.toString(progress) + "\n";
    }
}

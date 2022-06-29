package by.epam.yanushkevich_irina.module4.task_3;

import java.util.Arrays;

public class Journal {

    private final Student[] student = new Student[10];

    Journal(Student... student) {
        System.arraycopy(student, 0, this.student, 0, student.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(student);
    }

    public Student[] getStudent() {
        return student;
    }

    public boolean findBestStudent(int[] marks) {

        boolean bestStudent = true;

        for (int mark : marks) {

            if (mark < 9) {
                bestStudent = false;
                break;
            }
        }
        return bestStudent;
    }

    public void printBestStudent() {

        for (int i = 0; i < student.length; i++) {

            if (findBestStudent(student[i].getProgress())) {
                System.out.println(getStudent()[i].getName() + " gr.N" + getStudent()[i].getGroup());
            }
        }
    }
}


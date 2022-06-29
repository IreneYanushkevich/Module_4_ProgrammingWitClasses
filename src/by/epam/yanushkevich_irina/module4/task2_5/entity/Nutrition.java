package by.epam.yanushkevich_irina.module4.task2_5.entity;

public enum Nutrition {
    BREAKFAST, ALL_INCLUSIVE, SELF_CATERING;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ');
    }
}

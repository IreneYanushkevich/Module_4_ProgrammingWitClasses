package by.epam.yanushkevich_irina.module4.task_5;

public class Counter {

    private int minValue;
    private int maxValue;
    private int currentValue;

    public Counter(int min, int max, int current) {

        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        if (current > max) {
            current = max;
        }

        if (current < min) {
            current = min;
        }

        currentValue = current;
        maxValue = max;
        minValue = min;
    }

    public Counter() {
        this(0, 10, 0);
    }

    public void increase() {
        currentValue++;
        if (currentValue > maxValue) {
            currentValue = minValue;
        }
    }

    public void decrease() {
        currentValue--;
        if (currentValue < minValue) {
            currentValue = maxValue;
        }
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Counter obj = (Counter) other;
        return this.maxValue == obj.maxValue && this.minValue == obj.minValue && this.currentValue == obj.currentValue;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + currentValue;
        result = prime * result + minValue;
        result = prime * result + maxValue;
        return result;
    }

    @Override
    public String toString() {
        return "min value = " + minValue + ", max value = " + maxValue + ", current value = " + currentValue;
    }
}


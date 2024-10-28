package by.lesson3.task1;

public class Bowl {
    private int amountOfFood;

    public Bowl() {
        amountOfFood = 0;
    }

    public Bowl(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void addFood(int number) {
        amountOfFood += number;
    }
}

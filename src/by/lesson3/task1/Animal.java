package by.lesson3.task1;

public abstract class Animal {
    protected String name;
    private static int animalsCounter = 0;

    public Animal(String name) {
        this.name = name;
        animalsCounter++;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int distance);

    public abstract void swim (int distance);

    public static void printAnimalsNumber() {
        System.out.println("Количество животных: " + animalsCounter);
    }
}


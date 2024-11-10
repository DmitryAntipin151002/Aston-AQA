package by.lesson3.task1;

public class Cat extends Animal {
    private static int catsCounter = 0;
    private boolean full = false;

    public Cat(String name)  {
        super(name);
        catsCounter++;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(getName() + " не может пробежать так далеко");
            return;
        }
        System.out.println(getName() + " пробелажал " + distance + "м");
    }

    @Override
    public void swim(int disctance) {
        System.out.println(getName() + " не умеет плавать!");
    }

    public void printCatsNumber() {
        System.out.println("Количество котов: " + catsCounter);
    }

    public void isFull() {
        if (full) {
            System.out.println(name + " сыт");
        }
        else {
            System.out.println(name + " голоден");
        }
    }

    public void eat(Bowl bowl, int amountOfFood) {
        if (bowl.getAmountOfFood() > amountOfFood) {
            System.out.println(getName() + " покушал из миски");
            full = true;
            bowl.setAmountOfFood(bowl.getAmountOfFood() - amountOfFood);
        }
        else {
            System.out.println(getName() + " недостаточно еды в миске");
        }
    }
}

package by.lesson3.task1;

public class Dog extends Animal{
    private static int dogsCounter = 0;

    public Dog(String name) {
        super(name);
        dogsCounter++;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void run(int distance) {
        if(distance > 500) {
            System.out.println(getName() + " не может пробежать так далеко");
            return;
        }
        System.out.println(getName() + " пробежал " + distance + "м");
    }

    @Override
    public void swim(int distance) {
        if(distance > 10) {
            System.out.println(getName() + " не может проплыть так далеко");
            return;
        }
        System.out.println(super.getName() );
    }

    public void printDogsNumber() {
        System.out.println("Количество собак: " + dogsCounter);
    }
}

package by.lesson3.task1;

public class App {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Cat barsik = new Cat("Барсик");

        bobik.run(200);
        bobik.swim(12);
        barsik.run(100);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Рыжий");
        cats[1] = new Cat("Томас");
        cats[2] = new Cat("Пушок");
        cats[3] = new Cat("Нимбус");
        cats[4] = new Cat("Паунси");

        Bowl bowl = new Bowl();
        bowl.addFood(70);
        for(Cat cat : cats) {
            cat.eat(bowl, 15);
            cat.isFull();
        }
    }
}
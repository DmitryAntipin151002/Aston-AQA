package by.lesson3.task2;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle("Жёлтый", "Чёрный", 7);
        System.out.println(circle + "\n");

        Triangle triangle = new Triangle("Синий", "Белый", 4, 8, 5);;
        System.out.println(triangle + "\n");

        Rectangle rectangle = new Rectangle("Зелёный", "Фиолетовый", 5, 12);
        System.out.println(rectangle + "\n");
    }
}

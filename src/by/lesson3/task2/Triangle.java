package by.lesson3.task2;

public class Triangle extends Figure implements IShape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String fillColor, String borderColor, double side1, double side2, double side3) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(calculatePerimeter() * (calculatePerimeter() - side1) * (calculatePerimeter() - side2)
                * (calculatePerimeter() - side3));
    }

    @Override
    public String toString() {
        return "Информация о треугольнике:" + "\nСторона 1: " + getSide1() + "\nСторона 2: "
                + getSide2() + "\nСторона 3: " + getSide3() + super.toString();
    }
}

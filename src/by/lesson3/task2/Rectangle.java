package by.lesson3.task2;

public class Rectangle extends Figure implements IShape{
    private double sidesA;
    private double sidesB;

    public Rectangle(String fillColor, String borderColor, double sidesA, double sidesB) {
        super(fillColor, borderColor);
        this.sidesA = sidesA;
        this.sidesB = sidesB;
    }

    public double getSidesA() {
        return sidesA;
    }

    public void setSidesA(double sidesA) {
        this.sidesA = sidesA;
    }

    public double getSidesB() {
        return sidesB;
    }

    public void setSidesB(double sidesB) {
        this.sidesB = sidesB;
    }

    @Override
    public double calculatePerimeter() {
        return (sidesA + sidesB) * 2;
    }

    @Override
    public double calculateArea() {
        return sidesA * sidesB;
    }

    @Override
    public String toString() {
        return "Информация о прямоугольнике:" + "\nПервая пара сторон: " + getSidesA() + "\nВторая пара сторон: "
                + getSidesB() + super.toString();
    }
}

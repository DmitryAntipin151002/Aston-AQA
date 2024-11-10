package by.lesson3.task2;

public abstract class Figure implements IShape {
    protected String fillColor;
    protected String borderColor;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "\nПериметр: " + calculatePerimeter() + "\nПлощадь: " + calculateArea() + "\nЦвет заливки: "
                + getFillColor() + "\nЦвет сторон: " + getBorderColor();
    }
}

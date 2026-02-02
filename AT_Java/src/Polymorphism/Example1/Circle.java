package Polymorphism.Example1;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String name() {
        return "Circle(r=" + r + ")";
    }
}

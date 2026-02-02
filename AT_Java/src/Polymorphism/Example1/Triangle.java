package Polymorphism.Example1;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height / 2.0;
    }

    @Override
    public String name() {
        return "Triangle(base=" + base + ", height=" + height + ")";
    }
}


package Polymorphism.Example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // ここでは「Shape」としてしか扱っていない
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Triangle(5, 2));

        printTotalArea(shapes);
    }

    // ★ このメソッドは「Shape」という抽象的な型だけを知っている
    public static void printTotalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape s : shapes) {
            System.out.println(s.name() + " area = " + s.area());
            total += s.area();   // ここで動的束縛：実体ごとの area() が呼ばれる
        }
        System.out.println("Total area = " + total);
    }
}

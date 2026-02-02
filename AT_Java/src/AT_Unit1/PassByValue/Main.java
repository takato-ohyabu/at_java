package AT_Unit1.PassByValue;

import AT_Unit1.Question4.B;

public class Main {
    public static void main(String[] args) {
        int ia = 3;
        int ib = 5;
        int ic = 7;
        MyClass cat = new MyClass(ia);
        MyClass dog = new MyClass(ib);
        MyClass pig = new MyClass(ic);
        dog = pig.doIt(dog, cat);
        int a = cat.getData();
        int b = dog.getData();
        int c = pig.getData();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

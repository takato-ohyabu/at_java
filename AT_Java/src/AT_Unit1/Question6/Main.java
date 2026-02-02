package AT_Unit1.Question6;

public class Main {
    public static void main(String[] args) {
        A a1 = new A(15);
        A a2 = new A(25);
        A a3 = new A(15);
        A a4 = a2.swap2(a1, a3);
        System.out.println(a1.getValue() + " " + a2.getValue() + " " +
                a3.getValue() + " " + a4.getValue());

        a2 = a4.swap1(a1, a2);
        System.out.println(a1.getValue() + " " + a2.getValue() + " " +
                a3.getValue() + " " + a4.getValue());
    }
}
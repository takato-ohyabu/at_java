package AT_Unit1.Question7;

public class Main {
    private static int n = 0;

    public Main() {
        n = n + 1;
    }

    public static void bar() {
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();

        /*! static variable will be shared across all instances of Main.
         * So the answer of this question is a) 8. */
        m1.setN(8);
        m3.foo();
    }

    public void foo() {
        System.out.println(n);
    }

    public void setN(int newValue) {
        n = newValue;
    }
}

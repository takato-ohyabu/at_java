package AT_Unit1.Question4;

public class Main {
    public static void main(String[] args) {
        A b = new B(20);
        System.out.println(b.getXX());
        System.out.println(((B) b).getYY());
    }
}
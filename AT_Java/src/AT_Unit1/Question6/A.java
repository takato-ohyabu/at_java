package AT_Unit1.Question6;

public class A {
    private int value;

    public A(int value) {
        this.value = value;
    }

    public A swap1(A first, A second) {
        int temp = second.value;
        second = first;
        this.value = temp;
        return first;
    }

    public A swap2(A first, A second) {
        A temp = second;
        second = first;
        first = temp;
        return temp;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

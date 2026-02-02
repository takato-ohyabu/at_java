package AT_Unit1.PassByValue;

public class MyClass {
    private int data;
    public MyClass(int data){
        this.data = data;
    }
    public MyClass doIt(MyClass a, MyClass b){
        MyClass temp = a;
        a = b;
        b = temp;
        a.data = a.data * 2;
        b.data = b.data * 3;
        data = a.data * 10;
        return b;
    }
    public MyClass doIt(MyClass a){
        a.data = a.data * 2;
        data = a.data * 10;
        return a;
    }
    public int getData(){
        return data;
    }
}

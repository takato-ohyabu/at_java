package AT_Unit1.Question4;

public class B extends A {
    private int yy;

    public B(int y) {
        yy = y;
    }

    public void addY(int y) {
        yy += y;
    }

    public void multY(int y) {
        yy *= y;
    }

    public int getYY() {
        return yy;
    }

    public void addBtoA(){
        super.addX(yy);
    }
}

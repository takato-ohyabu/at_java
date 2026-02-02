package AT_Unit1.FRQ;

public class Bug {
    private String name;
    private int legs;

    public Bug(String n, int l) {
        this.name = n;
        this.legs = l;
    }

    public void printBug() {
        System.out.println("Name of the bug: " + this.name + " Number of legs: " + this.legs);
    }

    // getter
    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}

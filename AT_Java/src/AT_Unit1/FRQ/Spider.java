package AT_Unit1.FRQ;

public class Spider extends Bug {
    private boolean isPoisonous;
    private int bodyLength;

    public Spider(boolean isP, int bl) {
        super("Spider", 8);
        this.isPoisonous = isP;
        this.bodyLength = bl;
    }

    @Override
    public void printBug() {
        System.out.println(
            getLegs() + " legs, name \"" + getName() +
            "\", isPoisonous is " + isPoisonous +
            ", bodyLength " + bodyLength
        );
    }
}

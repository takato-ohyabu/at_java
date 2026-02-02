package AT_Unit1.FRQ;

public class Main {
    public static void main(String[] args) {
        Bug bug = new Bug("Bug", 4);
        Spider spider = new Spider(true, 3);

        System.out.println(bug.getName());    // Bug
        System.out.println(bug.getLegs());    // 4
        System.out.println(spider.getName()); // Spider
        System.out.println(spider.getLegs()); // 8

        bug.printBug();    // 4 legs, name "Bug"
        spider.printBug(); // 8 legs, name "Spider", isPoisonous is true, bodyLength 3

        bug.setLegs(200);
        bug.setName("Centipede");
        spider.setLegs(2000);
        spider.setName("Milli");

        bug.printBug();    // 200 legs, name "Centipede"
        spider.printBug(); // 2000 legs, name "Milli", isPoisonous is true, bodyLength 3
    }
}
package 신석호.chapter2.alice;

public class Main {
    public static void main(String[] args) {
        Alice alice = new Alice(140, "복도");
        Alice alice2 = new Alice(140, "복도");


        Door door = new Door();
        Beverage beverage = new Beverage();

        alice.drinkBeverage(beverage);
        alice.passDoor(door);

//        System.out.println(alice);
//        System.out.println(alice2);
    }
}

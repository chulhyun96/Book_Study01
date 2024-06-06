package 박철현.chapter2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alice alice = new Alice(130,"집");
        Door door = new Door();
        Beverage beverage = new Beverage();

        alice.drinkBeverage(beverage,0.5);
        alice.throughDoor(door);
    }
}

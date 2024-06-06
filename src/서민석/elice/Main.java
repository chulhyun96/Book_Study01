package 서민석.elice;

public class Main {
    public static void main(String[] args) {
    Alice alice = new Alice(160,"통로");
    Juice juice = new Juice();
    LittleDoor door = new LittleDoor(100);
    alice.takeJuice();
    alice.drink(juice);

    alice.passDoor(door);

    }

}

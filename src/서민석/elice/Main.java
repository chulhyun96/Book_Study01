package 서민석.elice;

public class Main {
    public static void main(String[] args) {
    Alice alice = new Alice(160,"통로");
    Juice juice = new Juice(100);
    LittleDoor door = new LittleDoor(100);
    alice.takeJuice(juice);

    alice.drink();
    alice.passDoor(door);

    alice.drink();
    alice.passDoor(door);

    }

}

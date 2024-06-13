package 박철현.chapter4;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        Rabbit rabbit = new Rabbit();

        Witness witness = king.callWitness(rabbit);
        String result = king.tell(witness);
        System.out.println(result);
    }
}

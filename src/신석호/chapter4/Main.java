package 신석호.chapter4;

public class Main {

    public static void main(String[] args) {
        Judge king = new King();
        Judge queen = new Queen();
        Rabbit rabbit = new Rabbit();

        rabbit.setWitnessName("HatSalesMan");
        king.startJudge(rabbit);
    }
}

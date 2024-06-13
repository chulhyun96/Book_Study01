package 신석호.chapter4;

import 설지수.chapter4.Witness;

public class Main {

    public static void main(String[] args) {
        Judge king = new King();
        Judge queen = new Queen();
        Rabbit rabbit = new Rabbit();

        rabbit.setWitnessName("HatSalesMan");
        king.startJudge(rabbit);
    }
}

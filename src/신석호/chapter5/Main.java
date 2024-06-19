package 신석호.chapter5;

public class Main {

    public static void main(String[] args) {
        King king = new King();

        String witnessMan1 = "hatSalesMan";
        king.startJudge(witnessMan1);

        String witnessMan2 = "alice";
        king.startJudge(witnessMan2);

        String witnessMan3 = "chef";
        king.startJudge(witnessMan3);
    }
}

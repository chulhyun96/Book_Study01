package 신석호.chapter4;

public abstract class Judge {

    public void startJudge(Rabbit rabbit) {
        System.out.println("증인 입장시켜라");
        rabbit.callWitness();
    }
}

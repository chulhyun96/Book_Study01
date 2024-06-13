package 설지수.chapter4;

public class King {
    public Witness callWitnessByRabbit(Rabbit rabbit) {
        System.out.println("토끼야 증인 불러라");
        return rabbit.callWitness();
    }

    public void requestTestimony(Witness witness) {
        System.out.println("증언해봐라");
        witness.testify();
    }

    public void StartTrial() {
        System.out.println("재판 시작하겠습니다.");
    }
}

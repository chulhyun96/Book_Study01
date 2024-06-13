package 설지수.chapter4.ex;


public class King {

    public void testifyBySomeone(Merchant merchant) {
        System.out.println("증언해봐라");
        merchant.testify();
    }

    public void StartTrial() {
        System.out.println("재판 시작하겠습니다.");
    }

    public Merchant callWitnessByRabbit(Rabbit rabbit) {
        System.out.println("토끼야 증인 불러라");
        return rabbit.callWitness();
    }
}

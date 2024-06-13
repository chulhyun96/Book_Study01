package 설지수.chapter4;

public class Rabbit {
    private String witnessName;
    //  - 왕의 요청을 받은 토끼는 모자 장수에게 증인석으로 입장할 것을 요청한다.
    public Witness callWitness() {
        System.out.println("증인 입장하겠습니다.");
        return FactoryWitness.createWitness(witnessName);
    }

    public void setWitnessName(String witnessName) {
        this.witnessName = witnessName;
    }
}

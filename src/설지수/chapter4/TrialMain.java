package 설지수.chapter4;

public class TrialMain {

    public static void main(String[] args) {

//  - 누군가가 왕에게 재판을 요청함으로써 재판이 시작된다.
        Someone someone = new Someone();
        King king = new King();
        Rabbit rabbit = new Rabbit();
        someone.requestTrial(king);

//  - 왕이 하얀 토끼에게 증인을 부를 것을 요청한다.
//  - 모자 장수는 증인석에 입장함으로써 토끼의 요청에 응답한다.
//  - 모자 장수의 입장은 왕이 토끼에게 요청했던 증인 호출에 대한 응답이기도 하다.
        rabbit.setWitnessName("");
        Witness witness = king.callWitnessByRabbit(rabbit);

//  - 이제 왕은 모자 장수에게 증언할 것을 요청한다.
        king.testifyBySomeone(witness);

    }
}

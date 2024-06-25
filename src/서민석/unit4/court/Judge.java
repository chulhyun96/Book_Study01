package 서민석.unit4.court;

public abstract class Judge {
    public void startTrial(){
        System.out.println("재판을 시작합니다.");
    }
    public Witness witnessRequest(WhiteRabbit whiteRabbit){
        System.out.println("목격자를 증인석으로 부르시오");
        return whiteRabbit.callWitness();
    }

    public void tellTruth(Witness witness){
        witness.tell();
    }
}

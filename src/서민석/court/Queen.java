package 서민석.court;

public class Queen extends Judge {

    @Override
    public void startTrial() {
        super.startTrial();
    }


    @Override
    public Witness witnessRequest(WhiteRabbit whiteRabbit) {
        return super.witnessRequest(whiteRabbit);
    }

    @Override
    public void tellTruth(Witness witness) {
        System.out.println("여왕:누가 내 파이를 훔쳐갔는지 말해라!");
        super.tellTruth(witness);
    }
}

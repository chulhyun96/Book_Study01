package 서민석.court;

public class King extends Judge{

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
        System.out.println("왕:누가 여왕의 파이를 훔쳤는지 말하시오");
        super.tellTruth(witness);
    }
}

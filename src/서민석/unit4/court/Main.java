package 서민석.unit4.court;


public class Main {
    public static void main(String[] args) {

        Court court = new Court();
        WhiteRabbit rabbit = new WhiteRabbit();

        Judge judge = court.Judge("왕");

        court.trialStart(judge);

        rabbit.setWitnesses("모자장수");

        Witness witness = judge.witnessRequest(rabbit);
        witness.entranceWitnessStand();

        judge.tellTruth(witness);

//        rabbit.setWitnesses("공작부인");
//        witness = judge.witnessRequest(rabbit);
//        witness.entranceWitnessStand();
//        judge.tellTruth(witness);
//
//        judge = court.Judge("여왕");
//        court.trialStart(judge);
//
//        rabbit.setWitnesses("앨리스");
//        witness = judge.witnessRequest(rabbit);
//        witness.entranceWitnessStand();
//        judge.tellTruth(witness);

    }
}

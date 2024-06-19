package 서민석.court;

public class WhiteRabbit {

    private String witnesses;


    public Witness callWitness() {
        System.out.println("토끼:"+this.witnesses+"는 증인석으로 나오시오");
        return FactoryWitness.createWitness(witnesses);

    }

    public void setWitnesses(String witnesses) {
        this.witnesses = witnesses;
    }
    //    public WhiteRabbit(Witness[] witnesses) {
//        witnessesList.addAll(Arrays.asList(witnesses));
//    }

//    public void callWitness() {
//        for (Witness witness : witnessesList) {
//            witness.entranceWitnessStand();
//        }
//        for (Witness witness : witnessesList) {
//            if (witness instanceof Witness hatSeller) {
//                hatSeller.entranceWitnessStand();
//            } else if (witness instanceof Witness nobleLady) {
//                nobleLady.entranceWitnessStand();
//            } else if (witness instanceof Witness alice) {
//                alice.entranceWitnessStand();
//            }
//        }
//    }
}

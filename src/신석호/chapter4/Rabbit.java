package 신석호.chapter4;

public class Rabbit {
    //Rabbit은 witnessName을 알고 있어야한다.
    private String witnessName;

    public Witness callWitness(){
        Witness witness = FactoryWitness.createWitness(witnessName);
        witness.enterCourt();
        witness.testify();
        witness.leaveCourt();
        return witness;
    }

    public void setWitnessName(String witnessName) {
        this.witnessName = witnessName;
    }
}

package 박철현.chapter4;

public class Rabbit {
    private Witness witness;

    public Witness comeIn() {
        this.witness = new Witness();
        this.witness.walk();
        return this.witness;
    }
}

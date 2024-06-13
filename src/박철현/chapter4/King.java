package 박철현.chapter4;

public class King {
    public Witness callWitness(Rabbit rabbit) {
        return rabbit.comeIn();
    }

    public String tell(Witness witness) {
        return witness.tell();
    }
}

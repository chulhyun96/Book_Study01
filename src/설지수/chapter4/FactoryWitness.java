package 설지수.chapter4;

public abstract class FactoryWitness {
    public static Witness createWitness(String witnessName) {
        if (witnessName.equals("Merchant")) {
            return new Merchant();
        } else if (witnessName.equals("Cook")) {
            return new Cook();
        }
        return new DefaultWitness();
    }
}
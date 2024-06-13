package 신석호.chapter4;
//util 클래스
public abstract class FactoryWitness {
    public static Witness createWitness(String witnessName) {
        if (witnessName.equals("HatSalesMan")) {
            return new HatSalesMan();
        } else if (witnessName.equals("Chef")){
            return new Chef();
        }else if (witnessName.equals("Alice")){
            return new Alice();
        }
        return null;
    }
}

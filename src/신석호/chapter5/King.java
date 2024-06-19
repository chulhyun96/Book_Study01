package 신석호.chapter5;

public class King {

    public Witness startJudge(String witnessMan) {
        if (witnessMan.equals("hatSalesMan")){
            return new HatSalesMan();
        } else if (witnessMan.equals("alice")) {
            return new Alice();
        } else if (witnessMan.equals("chef")) {
            return new Chef();
        }
        return null;
    }
}

package 서민석.unit4.court;



public abstract class FactoryWitness {
    public static Witness createWitness(String witness) {
        if (witness.equals("모자장수")) {
            return new HatSeller();
        } else if (witness.equals("앨리스")) {
            return new Alice();
        }else if (witness.equals("공작부인")){
            return new NobleLady();
        }
        else return null;
    }
}
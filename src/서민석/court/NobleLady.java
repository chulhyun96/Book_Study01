package 서민석.court;

public class NobleLady implements Witness{
    @Override
    public void entranceWitnessStand() {
        System.out.println("귀족부인 입장");
    }
    @Override
    public void tell() {
        System.out.println("귀족부인:싫어요");
    }
}

package 서민석.unit4.court;

public class Alice implements Witness{

    @Override
    public void entranceWitnessStand() {
        System.out.println("앨리스 입장");
    }

    @Override
    public void tell() {
        System.out.println("앨리스:헉?");
    }
}
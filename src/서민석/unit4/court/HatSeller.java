package 서민석.unit4.court;
public class HatSeller implements Witness {

    private String name;

    public void entranceWitnessStand() {
        System.out.println("모자장수 입장");
    }

    public void tell() {
        System.out.println("모자장수:저는 그냥 모자장수 일 뿐 아무것도몰라요");
    }

//    public void Testimony() {
//        System.out.println("잘몰라요");
//    }
}

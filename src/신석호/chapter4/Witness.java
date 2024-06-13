package 신석호.chapter4;

public abstract class Witness {

    public void enterCourt(){
        System.out.println("재판장에 입장합니다.");
    }

    public void testify(){
        System.out.println("증언합니다");
    }

    public void leaveCourt(){
        System.out.println("재판장을 나갑니다.");
    }
}

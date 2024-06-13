package 신석호.chapter4;

public class HatSalesMan extends Witness{
    @Override
    public void enterCourt() {
        super.enterCourt();
    }

    @Override
    public void testify() {
        super.testify();
    }

    @Override
    public void leaveCourt() {
        super.leaveCourt();
    }

    public void sellHat(){
        System.out.println("모자를 팝니다.");
    }
}

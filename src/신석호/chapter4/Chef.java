package 신석호.chapter4;

public class Chef extends Witness{
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

    public void cook(){
        System.out.println("요리를 합니다.");
    }
}

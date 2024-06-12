package 신석호.chapter3.ex;

public class Suv extends Car{
    @Override
    public void StartEngine() {
        super.StartEngine();
    }

    @Override
    public void run() {
        super.run();
    }

    public void climbMountain(){
        System.out.println("산을 오릅니다.");
    }
}

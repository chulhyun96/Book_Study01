package 신석호.chapter3.ex;

public class SuperCar extends Car{
    @Override
    public void StartEngine() {
        super.StartEngine();
    }

    @Override
    public void run() {
        super.run();
    }

    public void fastRun(){
        System.out.println("자동차가 매우 빠른 속도로 앞으로 갑니다.");
    }
}

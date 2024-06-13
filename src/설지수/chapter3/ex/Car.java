package 설지수.chapter3.ex;

public class Car extends Transportation{
    @Override
    void turnOn() {
        super.turnOn();
    }

    @Override
    void goForward() {
        super.goForward();
    }

    @Override
    void goBackward() {
        super.goBackward();
    }

    @Override
    void turnLeft() {
        super.turnLeft();
    }

    @Override
    void turnRight() {super.turnRight();}

    public Car() {
    }

    @Override
    void stop() {super.stop();}

    @Override
    void turnOff() {
        super.turnOff();
    }
    
    void autoParking(){
        System.out.println("자동 주차");
    }
}

package 설지수.chapter3.ex;

public class Airplane extends Transportation{
    @Override
    void turnOn() {
        super.turnOn();
    }

    @Override
    void goForward() {
        super.goForward();
    }

    @Override
    void turnOff() {
        super.turnOff();
    }

    @Override
    void stop() {
        super.stop();
    }

    @Override
    void turnRight() {
        super.turnRight();
    }

    @Override
    void turnLeft() {
        super.turnLeft();
    }
    
    void fly(){
        System.out.println("날기");
    }
}

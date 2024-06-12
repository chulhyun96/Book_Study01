package 설지수.chapter3.ex;

public class Ship extends Transportation{
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
    void turnRight() {
        super.turnRight();
    }

    @Override
    void stop() {
        super.stop();
    }

    @Override
    void turnOff() {
        super.turnOff();
    }

    void floatOnWater(){
        System.out.println("물에 뜸");
    }
}

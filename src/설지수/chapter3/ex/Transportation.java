package 설지수.chapter3.ex;

public abstract class Transportation {

    void turnOn(){
        System.out.println("엔진 시동");
    }
    void goForward(){
        System.out.println("앞으로 운전");
    }
    void goBackward(){
        System.out.println("후진");
    }
    void turnLeft(){
        System.out.println("왼쪽으로 꺾기");
    }
    void turnRight(){
        System.out.println("오른쪽으로 꺾기");
    }
    void stop(){
        System.out.println("정지");
    }
    void turnOff(){
        System.out.println("시동 끔");
    }
}

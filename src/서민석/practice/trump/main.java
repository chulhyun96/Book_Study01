package 서민석.practice.trump;

public class main {
    public static void main(String[] args) {

    Trump[] trumps = {new TrumpHuman(), new TrumpBird(), new TrumpRabbit()};

    TrumpRabbit rabbit = new TrumpRabbit();

        for (Trump trump : trumps) {
            doSomething(trump);
        }
    }

    static void doSomething(Trump trump) {
        if (trump instanceof TrumpHuman human) {
            human.say();
        } else if (trump instanceof TrumpBird bird) {
            bird.flying();
        } else if (trump instanceof TrumpRabbit rabbit) {
            rabbit.jump();
        }
    }

}

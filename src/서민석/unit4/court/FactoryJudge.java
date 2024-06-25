package 서민석.unit4.court;

public abstract class FactoryJudge {
    public static Judge createJudge(String judgeName) {
        if (judgeName.equals("왕")) {
            return new King();
        } else if (judgeName.equals("여왕")) {
            return new Queen();
        } else return null;

    }
}
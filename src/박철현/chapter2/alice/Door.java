package 박철현.chapter2.alice;

public class Door {
    private int height = 40;

    public String validateHeight(int height) {
        if (height <= this.height) {
            return "통과";
        }
        return "거절";
    }
}

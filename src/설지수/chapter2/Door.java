package 설지수.chapter2;

public class Door {
    private int height;

    public Door(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String validateHeight(int height) {
        if (height <= this.height ){
            return "통과";
        }
        return "통과할 수 없습니다.";
    }
}

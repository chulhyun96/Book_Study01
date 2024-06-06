package 서민석.elice;

public class LittleDoor {
    public int height;

    public LittleDoor(int height) {
        this.height = height;
    }

    public boolean validHeight(int height){
        if(height<this.height){
            System.out.println("문이 열립니다.");
            return true;
        }
        else
            return false;
    }
}

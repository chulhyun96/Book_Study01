package 신석호.chapter2.alice;

public class Door {

    private int height = 40;


    public void compareHeight(int height) {

        if (this.height >= height) {
            System.out.println("정원으로 입장");
        }
        else
            System.out.println("다시 복도로");

    }
}

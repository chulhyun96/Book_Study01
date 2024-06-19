package 신석호.chapter5;


public class Chef implements Witness {
    @Override
    public void testify() {
        System.out.println("증언 시작");
        System.out.println("그림으로 증언");
        System.out.println("증언 끝");
    }
}

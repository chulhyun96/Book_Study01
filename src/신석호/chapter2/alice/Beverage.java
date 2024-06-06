package 신석호.chapter2.alice;

public class Beverage {
    private double quantity = 1;

    public void drunken(double quantity) {
        this.quantity -= quantity;
        System.out.println("음료의 양은" + " " + this.quantity + " "+ "만큼 남았습니다.");
    }
}

package 신석호.chapter2.alice;

public class Alice {
    private int height;
    private String location;
    Beverage beverage = new Beverage();
    Door door = new Door();

    public Alice(int height, String location) {
        this.height = height;
        this.location = location;
    }

    public void drinkBeverage(Beverage beverage) {
        this.beverage.drunken(0.2);
        height -= 40;
        System.out.println("엘리스의 키는 " + height + "입니다.");
    }

    public void passDoor(Door height) {
        door.compareHeight(this.height);
    }

    public int getHeight() {
        return height;
    }
}

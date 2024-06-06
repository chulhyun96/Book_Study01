package 박철현.chapter2.alice;

public class Alice {
    private int height;
    private String location;
    private Beverage beverage;


    public Alice(int height, String location) {
        this.height = height;
        this.location = location;
    }

    public void drinkBeverage(Beverage beverage, double quantity) {
        this.beverage = beverage;
        beverage.drunken(quantity);
        this.height = 40;
        this.beverage = null;
    }

    public void throughDoor(Door door) {
        String result = door.validateHeight(this.height);
        if (result.equals("통과")) {
            this.location = "아름다운 정원";
            return;
        }
        this.location = "집";
    }
}

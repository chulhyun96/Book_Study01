package 박철현.chapter7;

public class Coffee {
    private String name;
    private int cost;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.cost = menuItem.getPrice();
    }

    public String getName() {
        return name;
    }
}

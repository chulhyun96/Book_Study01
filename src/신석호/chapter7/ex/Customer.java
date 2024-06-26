package 신석호.chapter7.ex;

public class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = new Coffee(menuItem);
    }
}

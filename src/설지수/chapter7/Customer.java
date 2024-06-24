package 설지수.chapter7;

public class Customer {

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        barista.makeCoffee(menuItem);
    }

}

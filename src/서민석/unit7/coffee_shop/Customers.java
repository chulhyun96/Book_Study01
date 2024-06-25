package 서민석.unit7.coffee_shop;

public interface Customers {

    Item order(MenuList list,String menuName);

    int pay();

    void takeMoney(int money);

    void getCoffee(Coffee makedCoffee);

    String getName();
}

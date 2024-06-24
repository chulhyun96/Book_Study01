package 설지수.chapter7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("카페라떼", 5000));
        menuItems.add(new MenuItem("아메리카노", 2000));
        menuItems.add(new MenuItem("바닐라라떼", 5000));

        Customer customer = new Customer();
        Barista barista = new Barista();
        Menu menu = new Menu(menuItems);

        customer.order("카페라떼",menu,barista);

    }
}

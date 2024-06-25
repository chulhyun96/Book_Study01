package 서민석.unit7.coffee_shop;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Barista barista1= new AmateurBarista();
        Cashier cashier = new PartTimer();
        Customers customer = new Customer("minseok",10000);
        MenuList list = new MenuList();

        Item americano = new Item("아메리카노",2000);
        Item latte = new Item("라떼",2500);

        list.addMenu(americano,latte);


        Item orderedMenu = customer.order(list,"아메리카노");

        cashier.takeorder(customer,orderedMenu,barista1);



    }
}

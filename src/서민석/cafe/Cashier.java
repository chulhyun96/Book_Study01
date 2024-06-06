package 서민석.cafe;

public class Cashier implements Employee {
    public void takeOrder(Customer customer,Barista barista,String name,MenuList menuList) {
        Menu menu = menuList.getMenu(name);
        System.out.println(menu);
        if (menu != null) {
            int menuPrice = menu.getPrice();
            System.out.println("주문하신 메뉴 " + name + "의 가격은 " + menuPrice + "원 입니다.");
            int exchange = customer.pay()-menuPrice;
            System.out.println("거스름돈은 " + exchange + "원 입니다. 감사합니다.");
            customer.takeExchange(exchange);

            String result = barista.makeCoffee(name);
            System.out.println("주문하신 " + result + " 나왔습니다.");
        } else {
            System.out.println("죄송합니다. " + name + "는 메뉴에 없습니다.");
        }
    }
}

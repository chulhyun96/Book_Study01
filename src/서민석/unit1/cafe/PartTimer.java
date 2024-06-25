package 서민석.unit1.cafe;

public class PartTimer implements Cashier {

    @Override
    public void takeOrder(Customer customer,Barista barista,String name,MenuList menuList) {
        Menu menu = menuList.getMenu(name);
        System.out.println(menu);
        if (menu != null) {
            int menuPrice = menu.getPrice();
            System.out.println("주문하신 메뉴 " + name + "의 가격은 " + menuPrice + "원 입니다.");

            int exchange = customer.pay()-menuPrice;
            System.out.println("거스름돈은 " + exchange + "원 입니다. 잠시만 기다려주세요.");
            customer.takeExchange(exchange);

//            String result = baristas.makeCoffee(name);
            String result = barista.makeCoffee(name);
            System.out.println("주문하신 " + result + " 나왔습니다.");
        } else {
            System.out.println("죄송합니다. " + name + "는 메뉴에 없습니다.");
        }
    }

//    public void takeOrders(Customer customer,Barista[] baristas,String name,MenuList menuList) {
//        Menu menu = menuList.getMenu(name);
//        System.out.println(menu);
//        if (menu != null) {
//
//
//
//            int menuPrice = menu.getPrice();
//            System.out.println("주문하신 메뉴 " + name + "의 가격은 " + menuPrice + "원 입니다.");
//
//            int exchange = customer.pay()-menuPrice;
//            System.out.println("거스름돈은 " + exchange + "원 입니다. 잠시만 기다려주세요.");
//            customer.takeExchange(exchange);
//
//            Barista selectedBarista = selectBarista(baristas);
//
////            String result = baristas.makeCoffee(name);
//            String result = selectedBarista.makeCoffee(name);
//            System.out.println("주문하신 " + result + " 나왔습니다.");
//        } else {
//            System.out.println("죄송합니다. " + name + "는 메뉴에 없습니다.");
//        }
//    }
//    public Barista selectBarista(Barista[] baristas) {
//        for (Barista barista : baristas) {
//            if (barista instanceof ExpertBarista) {
//                return barista;
//            }
//        }
//        for (Barista barista : baristas) {
//            if (barista instanceof Barista) {
//                return barista;
//            }
//        }
//        throw new IllegalArgumentException("바리스타가 없습니다.");
//    }
}

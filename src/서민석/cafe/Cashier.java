package 서민석.cafe;

public class Cashier {
    public void takeOrder(Customer customer,Barista barista,String name,MenuList menuList) {
        Menu menu = menuList.getMenu(name); // 메뉴 리스트에서 메뉴를 가져옴
        System.out.println(menu);
        if (menu != null) { // 가져온 메뉴가 유효한지 확인
            int menuPrice = menu.getPrice(); // 메뉴의 가격을 가져옴
            System.out.println("주문하신 메뉴 " + name + "의 가격은 " + menuPrice + "원 입니다.");
            customer.pay(menuPrice); // 고객에게 결제 처리
            System.out.println("거스름돈은 " + customer.getMoney() + "원 입니다. 감사합니다.");
            String result = barista.makeCoffee(name); // 바리스타에게 주문 처리 요청
            System.out.println("주문하신 " + result + " 나왔습니다.");
        } else {
            System.out.println("죄송합니다. " + name + "는 메뉴에 없습니다.");
        }
    }
}

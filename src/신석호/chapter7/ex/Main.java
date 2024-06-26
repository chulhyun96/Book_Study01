package 신석호.chapter7.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 메뉴 항목 생성
        MenuItem americano = new MenuItem("아메리카노", 1500);
        MenuItem cappuccino = new MenuItem("카푸치노", 2000);
        MenuItem latte = new MenuItem("카라멜 마키아또", 2500);
        MenuItem espresso =  new MenuItem("에스프레소", 2500);

//        // 메뉴 리스트 생성 후 항목 추가
//        List<MenuItem> menuItems = new ArrayList<>();
//        menuItems.add(americano);
//        menuItems.add(latte);
//        menuItems.add(cappuccino);
//        menuItems.add(espresso);
//
//        // 메뉴 생성
//        Menu menu = new Menu(menuItems);

        // 메뉴 생성
        Menu menu = new Menu(Arrays.asList(americano, latte, cappuccino, espresso));

        // 바리스타 생성
        Barista barista = new Barista();

        // 고객 생성 및 주문
        Customer customer = new Customer();
        customer.order("Latte", menu, barista);
    }
}

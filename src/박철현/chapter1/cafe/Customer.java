package 박철현.chapter1.cafe;


public class Customer extends Employee {
    private String orderHistory;

    public String order(String menuName) {
        orderHistory = menuName;
        return menuName;
    }
    public void checkMyMenu(String menu) {
        if (menu.equals(orderHistory)) {
            System.out.println("감사합니다.");
        } else {
            System.out.println("저의 것이 아닙니다.");
        }
    }

    @Override
    public void doWorking() {
        System.out.println("업무 보기");
    }
}

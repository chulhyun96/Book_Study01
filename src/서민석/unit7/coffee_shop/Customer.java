package 서민석.unit7.coffee_shop;

public class Customer implements Customers {

    private String name;
    private int money;

    private Coffee equipment;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }


//    @Override
//    public Item chooseMenu(MenuList list,String menuName) {
//        return list.returnMenu(menuName);
//    }

    @Override
    public Item order(MenuList list,String menuName) {
        System.out.println(menuName+"로 주문 해야지~");
         return list.returnMenu(menuName);
    }

    @Override
    public int pay() {
        return this.getMoney();
    }

    @Override
    public void takeMoney(int money) {
        this.money=money;
    }

    @Override
    public void getCoffee(Coffee makedCoffee) {
        this.equipment=makedCoffee;
        System.out.println(equipment.getName()+"감사합니다");
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}

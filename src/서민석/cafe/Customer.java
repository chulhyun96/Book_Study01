package 서민석.cafe;

public class Customer {
    private String name;
    private int money;

    public void showMenu(){

    }

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String order(String name) {

        System.out.println(name + "하나주세요");
        return name;
//        Barista.makeCoffee(name);
    }
    public void pay(int MenuPrice){
        this.money-= MenuPrice;
    }

    public int getMoney() {
        return money;
    }
}
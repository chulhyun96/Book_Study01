package 서민석.unit1.cafe;

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
    public int pay(){
        return this.getMoney();
    }

    public void takeExchange(int exchange){
    this.money=exchange;
        System.out.println("잔액:"+this.money);
    }
    public int getMoney() {
        return money;
    }
}
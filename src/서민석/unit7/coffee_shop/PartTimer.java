package 서민석.unit7.coffee_shop;

public class PartTimer implements Cashier {
    @Override
    public void takeorder(Customers customer,Item item,Barista barista) {

        paymentRequest(customer,item);
        Coffee makedCoffee = barista.makeCoffee(item);
        System.out.println(customer.getName()+"님 주문하신"+makedCoffee.getName()+"입니다");
        customer.getCoffee(makedCoffee);
    }

    @Override
    public void requestItem() {

    }

    @Override
    public void paymentRequest(Customers customer,Item item) {
        System.out.println(item.getName()+"가격은"+item.getPrice()+"입니다");
        int money =customer.pay();
        money-= item.getPrice();
        System.out.println("잔돈은"+money+"입니다");
        customer.takeMoney(money);
    }

}

package 신석호.chapter7;

public class CaffeMain {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Menu americano =  new Menu("아메리카노", 1500);
        Menu cappuccino =  new Menu("카푸치노", 2000);
        Menu caramelMacchiato =  new Menu("카라멜 마키아또", 2500);
        Menu espresso =  new Menu("에스프레소", 2500);

        customer.order(americano.getName());
    }
}

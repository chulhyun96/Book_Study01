package 서민석.unit7.coffee_shop;

public interface Cashier {
    void takeorder(Customers customer,Item item,Barista barista);
    void requestItem();
    void paymentRequest(Customers customer,Item item);

}

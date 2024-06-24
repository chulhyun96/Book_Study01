package 박철현.chapter7;


public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();
        Menu menu = new Menu();
        customer.order("아메리카노", menu, barista);
    }
}

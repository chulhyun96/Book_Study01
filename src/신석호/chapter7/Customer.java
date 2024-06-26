package 신석호.chapter7;

public class Customer {

    public void order(String menu) {
        Barista barista = new Barista();
        barista.makeCoffee(menu);
    }
}

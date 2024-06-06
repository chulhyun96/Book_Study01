package 박철현.chapter1.cafe;

public class CafeMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Cashier newPartTimer = new NewPartTimer();


        String requiredCoffee = customer.order("아아");

        Barista proBarista = new ProfessionalBarista();
        Barista newPartTimer2 = new NewPartTimer2();

        Barista[] baristas = new Barista[]{proBarista, newPartTimer2};
        String coffee = "";
        for (Barista barista : baristas) {
            coffee = newPartTimer.takeOrder(barista,requiredCoffee);
        }

        System.out.println(coffee);
    }
}

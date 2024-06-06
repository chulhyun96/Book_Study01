package 서민석.cafe;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner();
        Menu americano = new Menu("아아",2000);
        owner.addMenu(americano);

        Cashier cashier = new Cashier();
        Barista barista = new Barista();

        Customer customer = new Customer("손님1",50000);

        String MenuName = customer.order("아아");
        cashier.takeOrder(customer,barista,MenuName,owner.getMenuList());


        System.out.println("123"+owner.getMenuList());

    }
}

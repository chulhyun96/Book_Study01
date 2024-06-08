package 서민석.cafe;

public class Main {
    public static void main(String[] args) {
      
        Owner owner = new Owner();
        Menu americano = new Menu("아이스 아메리카노",11000);
        owner.addMenu(americano);

        Cashier cashier = new PartTimer();
        Barista amateurBarista = new PartTimer2();
        Barista expertBarista = new ExpertBarista();



        Customer customer = new Customer("손님1",50000);
        String MenuName = customer.order("아이스 아메리카노");

//        Barista[] baristas = new Barista[]{amateurBarista,expertBarista};

//      cashier.takeOrders(customer,baristas,MenuName,owner.getMenuList());

        cashier.takeOrder(customer,amateurBarista,MenuName,owner.getMenuList());
        cashier.takeOrder(customer,expertBarista,MenuName,owner.getMenuList());


//       System.out.println("123"+owner.getMenuList());

    }
}

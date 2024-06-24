package 박철현.chapter7;



public class Customer {

    protected void order(String menuName, Menu menu, Barista barista) {
        MenuItem item = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(item);
        System.out.println(coffee.getName()+ " 받았습니다.");
    }
}

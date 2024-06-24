package 박철현.chapter7;


public class Barista {
    protected Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }
}

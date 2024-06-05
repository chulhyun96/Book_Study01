package 박철현.chapter1.cafe;

public class NewPartTimer implements Cashier{

    @Override
    public String takeOrder(Barista barista, String menuName) {
        return barista.makeCoffee(menuName)
                .orElse("없음");
    }
}

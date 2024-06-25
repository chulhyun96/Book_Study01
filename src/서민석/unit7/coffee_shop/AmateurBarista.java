package 서민석.unit7.coffee_shop;

public class AmateurBarista implements Barista{
    @Override
    public Coffee makeCoffee(Item item) {
        Coffee coffee = new Coffee(item.getName());

        System.out.println("개 어버버 거리면서 만든"+coffee.getName()+"완성");
        return coffee;
    }
}

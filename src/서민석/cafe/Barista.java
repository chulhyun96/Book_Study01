package 서민석.cafe;

public class Barista implements Employee2 {
    public String makeCoffee(String name) {
        System.out.println(name+"완성");
        return name;
    }

}
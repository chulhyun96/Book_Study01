package 서민석.unit7.coffee_shop;

import java.awt.print.PrinterAbortException;

public class Coffee {

    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}

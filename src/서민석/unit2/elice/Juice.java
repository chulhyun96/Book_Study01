package 서민석.unit2.elice;

import javax.sound.midi.Soundbank;

public class Juice {
    Integer quantity;

    public Juice(int quantity) {
        this.quantity = quantity;
    }

    public int drink(int quantity) {
        setQuantity(this.getQuantity()-quantity);
        System.out.println("남은양:"+getQuantity());
        return quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

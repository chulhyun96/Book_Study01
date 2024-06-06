package 서민석.elice;

import javax.sound.midi.Soundbank;

public class Juice {
    int quantity;

    public Juice(int quantity) {
        this.quantity = quantity;
    }

    public int drink(int quantity) {
        return this.getQuantity()-quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

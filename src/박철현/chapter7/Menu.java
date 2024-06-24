package 박철현.chapter7;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    protected Menu() {
        this.items = new ArrayList<>();
    }

    protected MenuItem choose(String menuName) {
        for (MenuItem item : items) {
            if (item.getName().equals(menuName))
                return item;
        }
        return null;
    }
}

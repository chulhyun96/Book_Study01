package 서민석.unit7.coffee_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuList {

    private List<Item> List = new ArrayList<>();

    public Item  returnMenu(String menuName) {
        for (Item item : List) {
            if (item.getName().equalsIgnoreCase(menuName)) {
                return item;
            }
        }
        return null;
    }

    public void addMenu(Item... items) {
        List.addAll(Arrays.asList(items));
    }
}


package 서민석.unit1.cafe;

import java.util.HashMap;
import java.util.Map;

public class MenuList {
    private Map<String, Menu> list;

    public MenuList() {
        this.list = new HashMap<>();
    }

    @Override
    public String toString() {
        return "MenuList [list=" + list + "]";
    }
//
    public void add(Menu menu) {
        list.put(menu.getName(), menu);
    }

    public int getMenuPrice(String name) {
        for (Map.Entry<String, Menu> entry : list.entrySet()) {
            if (entry.getKey().equals(name)) {
                return entry.getValue().getPrice();
            }
        }
        return 0;
    }
    public Menu getMenu(String name) {
        for (Map.Entry<String, Menu> entry : list.entrySet()) {
            String key = entry.getKey();
            Menu value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }
        return list.get(name);
    }

    public Map<String, Menu> getList() {
        return list;
    }
}

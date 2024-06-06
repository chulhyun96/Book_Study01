package 서민석.cafe;

import java.util.Map;

public class Owner {
    public MenuList menuList;

    public Owner() {
        this.menuList = new MenuList();
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public MenuList getMenuList() {
        return menuList;
    }
}

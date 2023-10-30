package com.dl.book_security.face;

import com.dl.book_security.pojo.Menu;

import java.util.List;

public interface MenuService {
    Menu createMenu(Menu menu);
    Menu updateMenu(Menu menu);
    List<Menu> getAllMenu();
    List<Menu> getMenuByRid(Long rid);
}

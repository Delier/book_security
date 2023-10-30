package com.dl.book_security.service;

import com.dl.book_security.dao.MenuDao;
import com.dl.book_security.pojo.Menu;
import com.dl.book_security.face.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    MenuDao menuDao;

    public MenuServiceImpl(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    @Override
    public Menu createMenu(Menu menu) {
        return null;
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return null;
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuDao.findAll();
    }

    @Override
    public List<Menu> getMenuByRid(Long rid) {
        return menuDao.findMenuByRid(rid);
    }
}

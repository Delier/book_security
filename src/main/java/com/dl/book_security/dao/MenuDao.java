package com.dl.book_security.dao;

import com.dl.book_security.pojo.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu,Long> {

    @Query(value = "select m.* from  menu m , menu_role m_r " +
            "where m.id = m_r.menu_id " +
            "and m_r.role_id = ?1",nativeQuery = true)
    List<Menu> findMenuByRid(Long rid);
}

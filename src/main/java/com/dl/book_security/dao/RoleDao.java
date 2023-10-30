package com.dl.book_security.dao;

import com.dl.book_security.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleDao extends JpaRepository<Role,Long> {

    @Query(value = "select r.* from role r , menu_role m_r " +
            "where m_r.role_id = r.id " +
            "and m_r.menu_id = ?1",nativeQuery = true)
    List<Role> findRoleByMid(Long id);
}

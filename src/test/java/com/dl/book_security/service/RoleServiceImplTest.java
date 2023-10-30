package com.dl.book_security.service;

import com.dl.book_security.face.RoleService;
import com.dl.book_security.pojo.Role;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class RoleServiceImplTest {

    @Autowired
    private RoleService roleService;

    @Test
    void createRole() {
    }

    @Test
    void updateRole() {
    }

    @Test
    void getRoleByMid() {
        List<Role> roles = roleService.getRoleByMid(1L);
        for (Role role : roles) {
            System.out.println(role);
        }
    }

    @Test
    void getRoleAll() {
    }
}
package com.dl.book_security.service;

import com.dl.book_security.dao.RoleDao;
import com.dl.book_security.face.RoleService;
import com.dl.book_security.pojo.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role createRole(Role role) {
        return null;
    }

    @Override
    public Role updateRole(Role role) {
        return null;
    }

    @Override
    public List<Role> getRoleByMid(Long mid) {
        return roleDao.findRoleByMid(mid);
    }

    @Override
    public List<Role> getRoleAll() {
        return roleDao.findAll();
    }
}

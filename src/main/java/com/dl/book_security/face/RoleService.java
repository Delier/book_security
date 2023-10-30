package com.dl.book_security.face;

import com.dl.book_security.pojo.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    Role updateRole(Role role);
    List<Role> getRoleByMid(Long mid);
    List<Role> getRoleAll();
}

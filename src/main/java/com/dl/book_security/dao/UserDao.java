package com.dl.book_security.dao;

import com.dl.book_security.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
}

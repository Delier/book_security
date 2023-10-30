package com.dl.book_security.service;

import com.dl.book_security.dao.UserDao;
import com.dl.book_security.pojo.User;
import com.dl.book_security.face.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.save(user);
        return user;
    }

    @Override
    public User getUser(Long id) {
        Optional<User> userOptional = userDao.findById(id);
        return userOptional.get();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}

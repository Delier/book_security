package com.dl.book_security.face;

import com.dl.book_security.pojo.User;

public interface UserService {

    User createUser(User user);

    User getUser(Long id);

    User  updateUser(User user);
}

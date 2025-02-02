package com.example.cachingwithredis.repo;

import com.example.cachingwithredis.model.User;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUsers();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean editUser(Long id, User user);
}

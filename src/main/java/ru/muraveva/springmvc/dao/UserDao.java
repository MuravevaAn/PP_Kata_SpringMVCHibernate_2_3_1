package ru.muraveva.springmvc.dao;


import ru.muraveva.springmvc.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}

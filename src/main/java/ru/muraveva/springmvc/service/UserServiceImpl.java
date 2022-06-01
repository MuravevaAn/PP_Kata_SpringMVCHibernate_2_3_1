package ru.muraveva.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.muraveva.springmvc.dao.UserDao;
import ru.muraveva.springmvc.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User updatedUser, long id) {
        userDao.updateUser(updatedUser, id);
    }

    @Override
    public User show(long id) {
       return userDao.show(id);
    }
}

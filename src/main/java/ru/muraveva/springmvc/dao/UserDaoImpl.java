package ru.muraveva.springmvc.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.muraveva.springmvc.model.User;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    private EntityManager entityManager;

    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getAllUsers() {
//        return entityManager.createQuery("from User", User.class).getResultList();
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void updateUser(User user) {

    }
}

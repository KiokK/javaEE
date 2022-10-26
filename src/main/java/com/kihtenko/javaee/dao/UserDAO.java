package com.kihtenko.javaee.dao;

import com.kihtenko.javaee.database.UserDB;
import com.kihtenko.javaee.entity.Role;
import com.kihtenko.javaee.entity.User;

import java.util.List;

public class UserDAO implements DAO<User, Long> {

    public User findByLoginAndPassword(String login, String password) {
        User user = UserDB.findByLoginAndPassword(login, password);
        if (user != null)
            return user;
        return null;
    }

    public User findByLogin(String login) {
        User user = UserDB.findByLogin(login);
        if (user != null)
            return user;
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findEntityByID(Long id) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean delete(User entity) {
        return false;
    }

    @Override
    public boolean create(User entity) {
        return false;
    }

    @Override
    public User update(User entity) {
        entity = UserDB.save(entity);
        return entity;
    }
}

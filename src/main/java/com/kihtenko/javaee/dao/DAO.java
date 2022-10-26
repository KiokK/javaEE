package com.kihtenko.javaee.dao;

import java.util.List;

public interface DAO <T, K>{
    List<T> findAll();
    T findEntityByID(K id);
    boolean deleteById(K id);
    boolean delete(T entity);
    boolean create(T entity);
    T update(T entity);
}

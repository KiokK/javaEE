package com.kihtenko.javaee.database;

import com.kihtenko.javaee.entity.Role;
import com.kihtenko.javaee.entity.User;

import java.util.List;

public class RoleDB {
    public static Role selectByID(Long id) {
        return Role.ADMIN;
    }
}

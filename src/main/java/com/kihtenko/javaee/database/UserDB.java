package com.kihtenko.javaee.database;

import com.kihtenko.javaee.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDB {

    public List<User> selectAll() {
        ArrayList<User> users = new ArrayList<>();
        Connection connection;
        try {
            connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while(resultSet.next()) {
                User user = new User(resultSet.getLong(1),//id
                                    RoleDB.selectByID(resultSet.getLong(2)),
                                    resultSet.getString(3),//password
                                    resultSet.getString(4),//nickname
                                    resultSet.getString(5),//name
                                    resultSet.getString(6),//surname
                                    resultSet.getString(7)//patronymic
                                    );
                user.setDateOfBarth(resultSet.getDate(8));//dateOfBarth
                user.setDateOfBarth(resultSet.getDate(9));//dateOfIncoming
                user.setPhone(resultSet.getString(10));//phone
                users.add(user);
            }

            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    /**
     * Сохраняет пользователя по логину и паролю в базу при регистрации
     * @param user (логин и пароль)
     * @return user
     */
    public static User save(User user) {
        Connection connection;
        try {
            connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            String q = "INSERT INTO users (password,login) " +
                    String.format("VALUES ('%s','%s')",  user.getPassword(), user.getLogin());
            statement.executeUpdate(q);
            statement.close();
            connection.close();
            return user;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static User findByLoginAndPassword(String login, String password) {
        Connection connection;
        try {
            connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            String q = "select * from users "+
                    String.format("where users.login = '%s' and users.password = '%s'", login, password);

            ResultSet resultSet = statement.executeQuery(q);

            User user = null;
            if (resultSet.next()) {
                user = new User();
                user.setId((long) resultSet.getInt("id"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("username"));
                if (resultSet.wasNull()) {
                    // handle NULL field value
                }
            }

            statement.close();
            connection.close();
            return user;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static User findByLogin(String login) {
        Connection connection;
        try {
            connection = ConnectorDB.getConnection();
            Statement statement = connection.createStatement();
            String q = "select * from users "+
                    String.format("where users.login = '%s'", login);

            ResultSet resultSet = statement.executeQuery(q);

            User user = null;
            if (resultSet.next()) {
                user = new User();
                user.setId((long) resultSet.getInt("id"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("username"));
                user.setSurname(resultSet.getString("surname"));
                user.setPatronymic(resultSet.getString("patronymic"));
                user.setPhone(resultSet.getString("phone"));
                user.setDateOfBarth(resultSet.getDate("dateOfBarth"));
                user.setDateOfIncoming(resultSet.getDate("dateOfIncoming"));

                if (resultSet.wasNull()) {
                    // handle NULL field value
                }
            }



            statement.close();
            connection.close();
            return user;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

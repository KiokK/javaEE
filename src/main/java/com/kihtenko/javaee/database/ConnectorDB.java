package com.kihtenko.javaee.database;

import java.sql.*;
import java.util.ResourceBundle;

public class ConnectorDB {
    //private static String url = "jdbc:mysql://localhost/java_ee_students?serverTimezone=Europe/Moscow&useSSL=false";
   // private static String url = "jdbc:mysql://localhost/java_ee_students";
//    private static String url = "jdbc:mysql://localhost:3306/java_ee_students?useSSL=false";
//    private static String url = "jdbc:mysql://localhost:3306/java_ee_students";
//    private static String username = "root";
//    private static String password = "1111";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection(url, username, password);
        ResourceBundle resource = ResourceBundle.getBundle("database");
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.password");
        return DriverManager.getConnection(url, user, pass);

//        //объект для создания запросов
//        Statement stm = connection.createStatement();
//        ResultSet resultSet = stm.executeQuery("select title from books");
//
//        while (resultSet.next()) {
//            pw.println(resultSet.getString("title"));
//        }
//        //Закрыть подключение к бд
//        stm.close();
    }
}

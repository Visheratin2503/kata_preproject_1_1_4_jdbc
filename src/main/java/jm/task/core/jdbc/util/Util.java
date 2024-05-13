package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {
    // реализация соединения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/new_schema_task_one?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String DB_PASSWORD = "visherroot";

    // Метод для настройки соединения с БД
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Не удалось установить соединение с базой данных", ex);
        }
    }
}


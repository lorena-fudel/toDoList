package com.todolist.todolist;

import java.sql.Connection;
import java.sql.DriverManager;

public class BBDDConector {
    private static BBDDConector instance;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/todolist?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql2701";


    private Connection con;

    public BBDDConector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(JDBC_URL,USER,PASSWORD);

            System.out.println("++++++ Connected to database successfully ++++++");
        }catch (Exception e){
            System.out.println("------ ERROR AL CONECTARME -------");
        }
    }

    public static BBDDConector GetInstance() {
        if (instance == null) {
            instance = new BBDDConector();
        }
        return instance;
    }

    public Connection GetConn() {
        return con;
    }
}
package com.TechChallengeJava.Nishchay.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DbConnection {

	final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6162685";
    final static String DB_HOST="sql6162685";
    final static String DB_PASSWORD="Snjmiy3d1f";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        java.sql.Connection conn=null;
        conn=DriverManager.getConnection(DB_URL,DB_HOST,DB_PASSWORD);
        return (Connection) conn;
    }
}

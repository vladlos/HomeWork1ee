package com.market;

import java.sql.*;

/**
 * User: Vlad
 * Date: 11.12.13
 * Time: 2:51
 */
public class DBController {
    Connection conn;

    public DBController() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/carshop","root" ,"" );//соединение с БД
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void newUser(String login, String pass){
        try {
            String sql = "INSERT INTO users (login,pass) VALUES ('"+login+"','"+pass+"'); ";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

//    public void newUser(String login, String pass){
//        try {
//            String sql = "INSERT INTO users (login, pass) VALUES ("+login+","+pass+"); ";
//            Statement statement = conn.createStatement();
//            ResultSet result = statement.executeQuery(sql);//получение данных из БД
//            result.next();
//            System.out.println(result.getString(1));
//        } catch (SQLException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//    }

}

package com.market;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * User: Vlad
 * Date: 11.12.13
 * Time: 2:51
 */
public class DBController {
    Connection conn;

    public DBController() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/carshop","root" ,"" );//соединение с БД
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
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

    public List<Car> getCars(){
        List<Car> cars = new LinkedList<Car>();

        try {
            String sql = "SELECT * FROM cars; ";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);//получение данных из БД
            while (result.next()){
                cars.add(new Car(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return cars;
    }

    public List<Car> getMyCars(User user){
        List<Car> cars = new LinkedList<Car>();

        try {
            String sql = " Select * from cars join cars_users on cars_users.car_id = cars.id where cars_users.user_id='"+user.getId()+"'  ";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);//получение данных из БД
            int i =0;
            while (result.next()){
                cars.add(new Car(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4)));
                System.out.println(cars.get(i++));
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return cars;
    }

    public List<User> getUsers(){
        List<User> userBase = new LinkedList<User>();

        try {
            String sql = "SELECT * FROM users; ";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);//получение данных из БД

            while (result.next()){
                userBase.add(new User(result.getInt(1), result.getString(2), result.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return userBase;
    }

    public void buyCar(Car car, User user){
        try {
            String sql = "INSERT INTO cars_users (user_id,car_id) VALUES ('"+user.getId()+"','"+car.getId()+"'); ";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }



}

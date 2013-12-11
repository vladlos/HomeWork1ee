package com.market;

import java.util.LinkedList;
import java.util.List;

/**
 * com.market.User: Vlad
 * Date: 10.12.13
 * Time: 23:09
 */
public class User {
    private String login;
    private String pass;
    private List<Car> cars = new LinkedList<Car>();

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}

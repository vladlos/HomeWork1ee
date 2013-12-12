package com.market;

import java.util.LinkedList;
import java.util.List;

/**
 * com.market.User: Vlad
 * Date: 10.12.13
 * Time: 23:09
 */
public class User {
    private int id;
    private String login;
    private String pass;


    public User(int id, String login, String pass) {
        this.login = login;
        this.pass = pass;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}

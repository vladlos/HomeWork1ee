package com.market;

import javax.servlet.http.HttpServlet;
import java.util.LinkedList;
import java.util.List;

/**
 * com.market.User: Vlad
 * Date: 10.12.13
 * Time: 23:29
 */
public class UserController extends HttpServlet{
public static List<User> userBase = new LinkedList<User>();
    public static void createUser(String name, String pass) {
        userBase.add(new User(name,pass));
    }

    public static boolean checkLogPass(String login,String pass){
        boolean ret = false;
        for(User user:userBase){
            if(user.getLogin().equals(login) && user.getPass().equals(pass)){
                ret = true;
            }
        }
        return ret;
    }

    public static String showUserList(){
       String result="<ul>";
       for(User user:userBase){
           result+="<li>"+user.getLogin()+"</li>";
       }
       result+="<ul>";
       return result;
    }
}

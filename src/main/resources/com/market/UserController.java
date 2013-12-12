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

private static DBController db = new DBController();
public static User currentUser;
public static List<User> userBase = db.getUsers();


    public static void createUser(String name, String pass) {
        db.newUser(name,pass);
    }

    public static boolean checkLogPass(String login,String pass){
        boolean ret = false;
        for(User user:userBase){
            if(user.getLogin().equals(login) && user.getPass().equals(pass)){
                currentUser=user;
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

    public static void buyCar(int id){
        db.buyCar(CarController.getCar(id),currentUser);
    }

    public static String showMyCars(){
        List<Car> cars = db.getMyCars(currentUser);

        String result="<ul>";
        for(Car car:cars){
            result+="<li class=\"car\"> Model:"+car.getModel()+"<br>Color: <div class=\"colorbox\" style=\"background-color:"+car.getColor()+"\">&nbsp</div>"+"<br>price: "+car.getPrice()+"$</li> ";
        }
        result+="<ul>";
        return result;
    }
}

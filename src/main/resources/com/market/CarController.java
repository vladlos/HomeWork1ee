package com.market;

import java.util.LinkedList;
import java.util.List;

/**
 * User: Vlad
 * Date: 11.12.13
 * Time: 1:42
 */
public class CarController {

    private static DBController db = new DBController();
    public static List<Car> carList = db.getCars();




    public static String showAllCars(){
        String result="<ul>";
        for(Car car:carList){
            result+="<li> Model:"+car.getModel()+"<a href=\"buy.jsp?buy="+car.getModel()+"\">buy</a></li> ";
        }
        result+="<ul>";
        return result;
    }

    public static Car getCar(String model){
        Car ret = null;
        for(Car car:carList){
            if(car.getModel().equals(model)){
                ret = car;
            }
        }
        return ret;
    }
}

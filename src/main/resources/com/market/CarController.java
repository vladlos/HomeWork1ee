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
            result+="<li class=\"car\"> Model:"+car.getModel()+"<br>Color: <div class=\"colorbox\" style=\"background-color:"+car.getColor()+"\">&nbsp</div>"+"<br>price: "+car.getPrice()+"$<br><a href=\"buy.jsp?buy="+car.getId()+"\">buy</a></li> ";
        }
        result+="<ul>";
        return result;
    }

    public static Car getCar(int id){
        Car ret = null;
        for(Car car:carList){
            if(car.getId()==id){
                ret = car;
            }
        }
        return ret;
    }
}

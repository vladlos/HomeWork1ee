package com.market;

import java.util.LinkedList;
import java.util.List;

/**
 * User: Vlad
 * Date: 11.12.13
 * Time: 1:42
 */
public class CarController {
    public static List<Car> carList = new LinkedList<Car>();
    public static void init(){
        carList.add(new Car("honda crv","green",1230));
        carList.add(new Car("Bugatti veyron","red",34000));
        carList.add(new Car("Lamborgini Diablo","red",64000));
        carList.add(new Car("Ferrari enzo","red",23000));
        carList.add(new Car("Nissan 350Z","silver",14000));
    }

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

package com.market;

/**
 * com.market.User: Vlad
 * Date: 10.12.13
 * Time: 23:17
 */
public class Car {
    String model;
    String color;
    int price;

    public Car(String model, String color, int price) {

        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

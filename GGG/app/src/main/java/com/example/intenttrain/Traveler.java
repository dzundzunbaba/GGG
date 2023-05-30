package com.example.intenttrain;

import java.io.Serializable;

public class Traveler implements Serializable {

    private Integer id;

    private String name;
    private String address1;

    public Traveler(String name, String address1, String address2, String time, String cost) {
        this.id = (int)(Math.random()*((1000000-1)+1))+1;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.time = time;
        this.cost = cost;
    }

    private String address2;
    private String time;
    private String cost;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}

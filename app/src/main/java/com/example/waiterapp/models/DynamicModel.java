package com.example.waiterapp.models;

public class DynamicModel {

    private final String icon;
    private final String name;
    private final String price;
    private String count;
    private int position;
    private int total;

    public DynamicModel(String icon, String name, String price) {
        this.icon = icon;
        this.name = name;
        this.price = price;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

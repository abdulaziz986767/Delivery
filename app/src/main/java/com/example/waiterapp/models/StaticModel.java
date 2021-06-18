package com.example.waiterapp.models;

public class StaticModel {

    private final String name;
    private final String image;

    public StaticModel(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}

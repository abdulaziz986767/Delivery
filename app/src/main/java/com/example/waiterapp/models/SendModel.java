package com.example.waiterapp.models;

import java.util.List;

public class SendModel {

    private final String date;
    private final int sTotal;

    private List<DynamicModel> dynamicModels;

    public SendModel(String date, int sTotal) {
        this.date = date;
        this.sTotal = sTotal;
    }

    public String getDate() {
        return date;
    }

    public int getsTotal() {
        return sTotal;
    }

    public List<DynamicModel> getDynamicModels() {
        return dynamicModels;
    }

    public void setDynamicModels(List<DynamicModel> dynamicModels) {
        this.dynamicModels = dynamicModels;
    }
}

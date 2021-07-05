package com.sendo.recycler_view_test.models;

public class Food {
    private String foodName;
    private int thumbnail;

    public Food(String foodName, int thumbnail) {
        this.foodName = foodName;
        this.thumbnail = thumbnail;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

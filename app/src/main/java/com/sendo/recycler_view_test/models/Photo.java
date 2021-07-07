package com.sendo.recycler_view_test.models;

public class Photo {
    private int albumId;
    private int id;
    private String title, url;
    private int thumbnail;

    public Photo(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public String getFoodName() {
        return title;
    }

    public void setFoodName(String foodName) {
        this.title = foodName;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }


}

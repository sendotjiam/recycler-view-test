package com.sendo.recycler_view_test.models;

public class Photo {
    private int albumId;
    private int id;
    private String title, url;
    private int thumbnailUrl;

    public Photo(int albumId, int id, String title, String url, int thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(int thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}

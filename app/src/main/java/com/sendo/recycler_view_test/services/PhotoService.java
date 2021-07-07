package com.sendo.recycler_view_test.services;

import com.sendo.recycler_view_test.models.Photo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotoService {
    @GET("photos")
    Call<List<Photo>> getPhotos();
}

package com.sendo.recycler_view_test.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.sendo.recycler_view_test.R;
import com.sendo.recycler_view_test.adapters.PhotoAdapter;
import com.sendo.recycler_view_test.api.ApiClient;
import com.sendo.recycler_view_test.models.Photo;
import com.sendo.recycler_view_test.services.PhotoService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<Photo> photoList = new ArrayList<>();
    RecyclerView rvPhotos;
    PhotoAdapter photoAdapter;
    TextView tvError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvError = findViewById(R.id.error);

        rvPhotos = findViewById(R.id.rv_photos);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvPhotos.setLayoutManager(layoutManager);

        photoAdapter = new PhotoAdapter(this);
        rvPhotos.setAdapter(photoAdapter);

        Retrofit retrofit = ApiClient.getRetrofit();
        PhotoService photoService = retrofit.create(PhotoService.class);
        Call<List<Photo>> call = photoService.getPhotos();

        call.enqueue(new Callback<List<Photo>>() {
            @Override
            public void onResponse(Call<List<Photo>> call, Response<List<Photo>> response) {
                if (response.isSuccessful()) {
                    photoList = response.body();
                    photoAdapter.setPhotos(photoList);
                }
            }
            @Override
            public void onFailure(Call<List<Photo>> call, Throwable t) {
                tvError.setText(t.getMessage());
            }
        });
    }
}
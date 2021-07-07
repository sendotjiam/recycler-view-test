package com.sendo.recycler_view_test.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sendo.recycler_view_test.R;
import com.sendo.recycler_view_test.adapters.PhotoAdapter;
import com.sendo.recycler_view_test.models.Photo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Photo> photos = new ArrayList<>();
    RecyclerView rvPhotos;
    PhotoAdapter photoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Photo steak1 = new Photo("Steak 1a", R.drawable.steak1);
        Photo noodle1 = new Photo("Noodle 1", R.drawable.noodles1);

        photos.add(steak1);
        photos.add(noodle1);

        photoAdapter = new PhotoAdapter(this, photos);

        rvPhotos = findViewById(R.id.rv_photos);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this);

        rvPhotos.setLayoutManager(layoutManager);

        rvPhotos.setAdapter(photoAdapter);
    }
}
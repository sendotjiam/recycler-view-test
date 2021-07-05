package com.sendo.recycler_view_test.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.sendo.recycler_view_test.R;
import com.sendo.recycler_view_test.adapters.FoodAdapter;
import com.sendo.recycler_view_test.models.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> foodArrayList = new ArrayList<>();
    RecyclerView rvFoods;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Food steak1 = new Food("Steak 1", R.drawable.steak1);
        Food noodle1 = new Food("Noodle 1", R.drawable.noodles1);

        foodArrayList.add(steak1);
        foodArrayList.add(noodle1);

        foodAdapter = new FoodAdapter(this, foodArrayList);

        rvFoods = findViewById(R.id.rv_foods);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this);

        rvFoods.setLayoutManager(layoutManager);

        rvFoods.setAdapter(foodAdapter);
    }
}
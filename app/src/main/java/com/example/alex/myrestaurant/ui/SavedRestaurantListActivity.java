package com.example.alex.myrestaurant.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.alex.myrestaurant.R;


import butterknife.Bind;
import butterknife.ButterKnife;

public class SavedRestaurantListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
    }
}
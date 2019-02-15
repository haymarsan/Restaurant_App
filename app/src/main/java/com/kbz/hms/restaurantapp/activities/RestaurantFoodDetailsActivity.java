package com.kbz.hms.restaurantapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.kbz.hms.restaurantapp.R;
import com.kbz.hms.restaurantapp.activities.adapters.FoodDetailsAdapter;

public class RestaurantFoodDetailsActivity extends AppCompatActivity {



    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, RestaurantFoodDetailsActivity.class);
        return intent;


    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_food_details);



        //ViewPager vpFoodDetails = findViewById(R.id.vp_food_details);

        //FoodDetailsAdapter foodDetailsAdapter = new FoodDetailsAdapter();
        //vpFoodDetails.setAdapter(foodDetailsAdapter);

    }
}

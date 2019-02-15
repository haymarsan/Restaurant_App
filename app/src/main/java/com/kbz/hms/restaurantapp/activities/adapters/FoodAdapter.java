package com.kbz.hms.restaurantapp.activities.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.restaurantapp.R;
import com.kbz.hms.restaurantapp.activities.delegates.FoodItemDelegate;
import com.kbz.hms.restaurantapp.activities.views.holders.FoodViewHolder;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private FoodItemDelegate mfoodItemDelegate;

    public FoodAdapter(FoodItemDelegate foodItemDelegate){
        mfoodItemDelegate = foodItemDelegate;
    }


    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.view_item_restaurant_food, viewGroup, false);
        return new FoodViewHolder(itemView, mfoodItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}

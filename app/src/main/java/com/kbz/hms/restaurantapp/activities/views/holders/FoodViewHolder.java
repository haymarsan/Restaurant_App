package com.kbz.hms.restaurantapp.activities.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;

import com.kbz.hms.restaurantapp.R;
import com.kbz.hms.restaurantapp.activities.delegates.FoodItemDelegate;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    public FoodItemDelegate mDelegate;

    Button btnDetail = itemView.findViewById(R.id.btn_details);



    public FoodViewHolder(@NonNull View itemView, @NonNull FoodItemDelegate foodItemDelegate) {
        super(itemView);
        mDelegate = foodItemDelegate;
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapFoodItem();
            }
        });


    }

}

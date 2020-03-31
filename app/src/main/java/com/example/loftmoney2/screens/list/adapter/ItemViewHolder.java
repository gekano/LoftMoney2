package com.example.loftmoney2.screens.list.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loftmoney2.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView price;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        price = itemView.findViewById(R.id.price);
    }

    public void bind(Item item){
        name.setText(item.getName());
        price.setText(item.getPrice());
    }
}


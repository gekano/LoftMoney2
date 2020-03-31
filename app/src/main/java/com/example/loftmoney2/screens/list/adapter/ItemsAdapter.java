package com.example.loftmoney2.screens.list.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loftmoney2.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private List<Item> items = new ArrayList<>();
    public void setNewData(List<Item> newData){
        items.clear();
        items.addAll(newData);
        notifyDataSetChanged();
    }
    public void addDataToTop(Item model){
        items.add(0, model);
        notifyItemInserted(0);
    }




    public void setItems(List<Item> items) {
        this.items = items;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {

        return items.size();
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, viewGroup, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int position) {
        Item item = items.get(position);
        itemViewHolder.bind(item);

    }
}
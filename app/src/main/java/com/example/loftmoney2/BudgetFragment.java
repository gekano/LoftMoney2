package com.example.loftmoney2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loftmoney2.screens.list.adapter.Item;
import com.example.loftmoney2.screens.list.adapter.ItemsAdapter;

public class BudgetFragment extends Fragment {
    ItemsAdapter adapter = new ItemsAdapter();
    static int ADD_ITEM_REQUEST = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_budget, null);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL,
                false));
        view.findViewById(R.id.fabMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent addItemIntent = new Intent(getActivity(), AddItemActivity.class);
                startActivityForResult(addItemIntent, ADD_ITEM_REQUEST);
            }
        });
        return view ;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ADD_ITEM_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            Item item = (Item) data.getSerializableExtra(Item.KEY_NAME);
            adapter.addDataToTop(item);
        }
    }
}

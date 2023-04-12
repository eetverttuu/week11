package com.example.week11;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListAllItemsActivity extends AppCompatActivity {

    private ItemStorage itemStorage;
    private RecyclerView  recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all_items);

        itemStorage = ItemStorage.getInstance();
        recyclerView = findViewById(R.id.rvUserList1);
        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), itemStorage.getItems()));
    }
}
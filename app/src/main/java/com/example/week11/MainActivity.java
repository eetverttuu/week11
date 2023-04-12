package com.example.week11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void switchToAddItem(View view){
        Intent intent = new Intent(this, AddNewItemActivity.class);
        startActivity(intent);
    }

    public void switchToListAllItem(View view){
        Intent intent = new Intent(this, ListAllItemsActivity.class);
        startActivity(intent);
    }

}
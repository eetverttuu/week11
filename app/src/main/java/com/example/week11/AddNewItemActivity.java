package com.example.week11;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddNewItemActivity extends AppCompatActivity {

    private EditText item, amount, amountUnit, otherInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_item);

        item = findViewById(R.id.txtItemName);
        amount = findViewById(R.id.txtItemAmount);
        amountUnit = findViewById(R.id.txtItemAmountUnit);
        otherInformation = findViewById(R.id.txtItemOtherInformation);
    }

    public void addUser(View view) {
        ItemStorage us = ItemStorage.getInstance();
        us.addUser(item.getText().toString(), amount.getText().toString(), amountUnit.getText().toString(), otherInformation.getText().toString());
    }
}
package com.example.week11;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView removeImage, editImage;

    TextView item, amountAndUnit, otherInformation;

    EditText editName;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        item = itemView.findViewById(R.id.txtItem);
        amountAndUnit = itemView.findViewById(R.id.txtAmountAndUnit);
        otherInformation =  itemView.findViewById(R.id.txtOtherInformation);
        removeImage = itemView.findViewById(R.id.imgRemove);
        editImage = itemView.findViewById(R.id.imgEdit);
        editName = itemView.findViewById(R.id.editName);
    }
}

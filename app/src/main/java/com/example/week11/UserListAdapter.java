package com.example.week11;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.item.setText(items.get(position).getItem());
        holder.amountAndUnit.setText(new StringBuilder().append(items.get(position).getAmount()).append(" ").append(items.get(position).getAmountUnit()).toString());
        holder.otherInformation.setText(new StringBuilder().append("Huom! ").append(items.get(position).getOtherInformation()).toString());
        holder.editName.setText(items.get(position).getAmount());

        holder.removeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = holder.getAdapterPosition();
                ItemStorage.getInstance().removeItem(items.get(pos).getItem());
                notifyItemRemoved(pos);
            }
        });

        holder.editImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = holder.getAdapterPosition();
                if (holder.editName.getVisibility() == View.VISIBLE) {
                    Item item = ItemStorage.getInstance().getItem(pos);
                    item.setItem(holder.editName.getText().toString());
                    holder.editName.setVisibility(View.GONE);
                    notifyDataSetChanged();
                } else {
                    holder.editName.setVisibility(View.VISIBLE);
                }
            }
        });

        }


        @Override
        public int getItemCount () {
            return items.size();
        }

    }


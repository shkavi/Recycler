package com.example.myloginapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterClass extends RecyclerView.Adapter<MyViewHolderCLass> {
    Context context;
    List<Item> items;

    public MyAdapterClass(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolderCLass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolderCLass(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderCLass holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.imageview.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}

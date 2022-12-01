package com.example.myloginapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolderCLass extends RecyclerView.ViewHolder {

    ImageView imageview;
    TextView nameView,emailView;





    public MyViewHolderCLass(@NonNull View itemView) {
        super(itemView);

        imageview=itemView.findViewById(R.id.imageview);
        nameView=itemView.findViewById(R.id.name);
        emailView=itemView.findViewById(R.id.email);
    }
}

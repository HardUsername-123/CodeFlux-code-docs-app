package com.example.codeflux;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView t1, t2;

    CardView cardView;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        img = (ImageView) itemView.findViewById(R.id.imageView);
        t1 = (TextView) itemView.findViewById(R.id.titleTextView);
        t2 = (TextView) itemView.findViewById(R.id.descriptionTextView);
        cardView = itemView.findViewById(R.id.cardItemView);
    }
}

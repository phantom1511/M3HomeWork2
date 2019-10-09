package com.example.dastantulokulov.m3homework2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.resultTextView);
    }
}

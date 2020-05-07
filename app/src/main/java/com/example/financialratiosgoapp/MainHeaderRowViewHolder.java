package com.example.financialratiosgoapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MainHeaderRowViewHolder extends RecyclerView.ViewHolder {

    public MainHeaderRowViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(String title) {
        TextView headerTextView = itemView.findViewById(R.id.header_textView);
        headerTextView.setText(title);
    }
}
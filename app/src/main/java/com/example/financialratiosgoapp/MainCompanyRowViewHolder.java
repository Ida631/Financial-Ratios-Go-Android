package com.example.financialratiosgoapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainCompanyRowViewHolder extends RecyclerView.ViewHolder {
    public MainCompanyRowViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(String title) {
        TextView companyTextView = itemView.findViewById(R.id.company);
        companyTextView.setText(title);
    }
}

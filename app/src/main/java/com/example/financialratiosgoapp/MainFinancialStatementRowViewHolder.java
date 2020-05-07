package com.example.financialratiosgoapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainFinancialStatementRowViewHolder extends RecyclerView.ViewHolder  {

    public MainFinancialStatementRowViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(String title) {
        TextView statementTextView = itemView.findViewById(R.id.statement_textView);
        statementTextView.setText(title);
    }
}

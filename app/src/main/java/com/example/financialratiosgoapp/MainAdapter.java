package com.example.financialratiosgoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int HEADER = 0;
    public static final int STATEMENT = 0;


    private List<MainItemModel> models;


    public MainAdapter(List<MainItemModel> mData) {
        models = mData;
    }

    @Override
    public int getItemViewType(final int position) {
        final MainItemModel item = models.get(position);
        return item.getType();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == HEADER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.row_header_home,
                    parent,
                    false);
            MainHeaderRowViewHolder holder = new MainHeaderRowViewHolder(view);
            return holder;
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.row_statement_home,
                    parent,
                    false);
            MainFinancialStatementRowViewHolder holder = new MainFinancialStatementRowViewHolder(view);
            return holder;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == HEADER) {
            Header model = (Header)models.get(position);
            String title = model.getmTitle();
            MainHeaderRowViewHolder mainHeaderRowViewHolder = (MainHeaderRowViewHolder) holder;
            mainHeaderRowViewHolder.bind(title);
        } else {
            FinancialStatement model = (FinancialStatement)models.get(position);
            String name = model.getmName();
            MainFinancialStatementRowViewHolder mainFinancialStatementRowViewHolder = (MainFinancialStatementRowViewHolder) holder;
            mainFinancialStatementRowViewHolder.bind(name);
        }
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}

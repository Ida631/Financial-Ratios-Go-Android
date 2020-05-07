package com.example.financialratiosgoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        RecyclerView recyclerView = findViewById(R.id.recycler_view_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MainAdapter mainAdapter = new MainAdapter(
                Arrays.asList(
                        new Header("Company and Fiscal Period"),
                        new Header("Income Statement"),
                        new FinancialStatement("Revenue"),
                        new FinancialStatement("Operating Income"),
                        new FinancialStatement("EBIT"),
                        new FinancialStatement("Interest Expense"),
                        new FinancialStatement("Income Tax Expense"),
                        new FinancialStatement("Net Income"),
                        new Header("Balance Sheet Statement")));
        recyclerView.setAdapter(mainAdapter);

    }
}

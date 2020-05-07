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
                        new Company( "Microsoft" ),
                        new Header("Income Statement"),
                        new FinancialStatement("Revenue"),
                        new FinancialStatement("Operating Income"),
                        new FinancialStatement("EBIT"),
                        new FinancialStatement("Interest Expense"),
                        new FinancialStatement("Income Tax Expense"),
                        new FinancialStatement("Net Income"),
                        new Header("Balance Sheet Statement"),
                        new FinancialStatement( "Cash and Cash Equivalents" ),
                        new FinancialStatement( "Short-term Investments" ),
                        new FinancialStatement( "Receivables" ),
                        new FinancialStatement( "Total Current Assets" ),
                        new FinancialStatement( "Total Assets" ),
                        new FinancialStatement( "Short-term Debt" ),
                        new FinancialStatement( "Long-term Debt" ),
                        new FinancialStatement( "Total Current Liabilities" ),
                        new FinancialStatement( "Total Liabilities" ),
                        new FinancialStatement( "Total Shareholder Equity" ),
                        new Header( "Cash Flow Statement" ),
                        new FinancialStatement("Operating Cash Flow" ),
                        new FinancialStatement( "Dividend Payments" ),
                        new FinancialStatement( "Free Cash Flow" )));

        recyclerView.setAdapter(mainAdapter);

    }
}

package com.example.financialratiosgoapp;

public class FinancialStatement implements MainItemModel {

    public static final int TYPE = 1;

    private String mName;

    public FinancialStatement(String name) {
        mName = name;
    }

    @Override
    public int getType() {
        return TYPE;
    }

    public String getmName() {
        return mName;
    }
}

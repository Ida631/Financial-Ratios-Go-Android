package com.example.financialratiosgoapp;

public class Company implements MainItemModel {
    public static final int TYPE = 2;
    private String mCompany;
    public Company(String company) {
        mCompany = company;
    }
    @Override
    public int getType() {
        return TYPE;
    }

    public String getmCompany() {
        return mCompany;
    }
}




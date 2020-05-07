package com.example.financialratiosgoapp;

public class Header implements MainItemModel {

    public static final int TYPE = 0;

    private String mTitle;

    public Header(String title) {
        mTitle = title;
    }

    @Override
    public int getType() {
        return TYPE;
    }

    public String getmTitle() {
        return mTitle;
    }
}

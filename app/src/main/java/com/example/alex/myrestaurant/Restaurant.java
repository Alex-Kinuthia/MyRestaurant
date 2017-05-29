package com.example.alex.myrestaurant;

import java.util.ArrayList;

/**
 * Created by alex on 5/29/17.
 */

public class Restaurant {
    private String mName;
    private String mPhone;
    private String mWebsite;
    private String mRating;
    private String mImageUrl;
    private ArrayList<String> mAddress = new ArrayList<>();

    public Restaurant(String name, String phone, String website,
                      double rating, String imageUrl, ArrayList<String> categories) {
        this.mName = name;
        this.mPhone = phone;
        this.mRating = rating;
        this.mImageUrl = imageUrl;
        this.mAddress = address;
        this.mLatitude = latitude;
        this.mLongitude = longitude;
        this.mCategories = categories;
    }

    public String getName() {
        return mName;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getWebsite() {
        return  mWebsite;
    }

    public double getRating() {
        return mRating;
    }

    public String getImageUrl(){
        return mImageUrl;
    }

    public ArrayList<String> getAddress() {
        return mAddress;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public ArrayList<String> getCategories() {
        return mCategories;
    }
}


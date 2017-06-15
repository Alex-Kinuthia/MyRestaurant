package com.example.alex.myrestaurant.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alex.myrestaurant.R;
import com.example.alex.myrestaurant.models.Restaurant;
import com.example.alex.myrestaurant.ui.RestaurantDetailFragment;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestaurantPagerAdapter.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestaurantPagerAdapter#newInstance} factory method to
 * create an instance of this fragment.
 */
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Restaurant> mRestaurants;

    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants) {
        super(fm);
        mRestaurants = restaurants;
    }

    @Override
    public Fragment getItem(int position) {
        return RestaurantDetailFragment.newInstance(mRestaurants, position);
    }

    @Override
    public int getCount() {
        return mRestaurants.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mRestaurants.get(position).getName();
    }
}
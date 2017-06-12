package com.example.alex.myrestaurant.util;

/**
 * Created by alex on 6/12/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
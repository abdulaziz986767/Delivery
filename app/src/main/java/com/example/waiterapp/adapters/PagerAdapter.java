package com.example.waiterapp.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.waiterapp.Fragments.DashboardFragment;
import com.example.waiterapp.Fragments.SentFragment;

public class PagerAdapter extends FragmentStateAdapter {

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return new SentFragment();
        }
        return new DashboardFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

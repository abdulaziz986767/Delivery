package com.example.waiterapp.Fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.waiterapp.R;
import com.example.waiterapp.adapters.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Objects;

public class HomeFragment extends Fragment {

    private ViewPager2 pager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        pager = view.findViewById(R.id.view_pager);

        tabLayout = view.findViewById(R.id.tab_layout);

        initViewPager();

        return view;
    }

    private void initViewPager() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            pager.setNestedScrollingEnabled(true);
        }
        pager.setAdapter(new PagerAdapter(Objects.requireNonNull(getActivity())));

        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout,
                pager, (tab, position) -> {
            switch (position) {
                case 0: {
                    tab.setText("Home");
                    tab.setIcon(R.drawable.ic_baseline_menu_24);
                } break;
                case 1: {
                    tab.setText("Sent");
                    tab.setIcon(R.drawable.ic_baseline_store_24);
                } break;
            }
        });
        mediator.attach();
    }

}
package com.example.waiterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.waiterapp.Fragments.HomeFragment;
import com.example.waiterapp.Fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.st_color));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            }
        }
        setContentView(R.layout.activity_main);

        BottomNavigationView nav = findViewById(R.id.nav_bar);
        nav.setSelectedItemId(R.id.item_home);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_layout, new HomeFragment())
                .commit();

        TextView titleTv = findViewById(R.id.tv_title);

        nav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.item_home:{
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, new HomeFragment())
                            .commit();

                    titleTv.setText("Home");
                    return true;
                }
                case R.id.item_search:{
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, new SearchFragment())
                            .commit();

                    titleTv.setText("Search");
                    return true;
                }
                case R.id.item_card:{
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, new Fragment())
                            .commit();

                    titleTv.setText("My Cart");
                    return true;
                }
                case R.id.item_account:{
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, new Fragment())
                            .commit();

                    titleTv.setText("My Profile");
                    return true;
                }
                default:
                    return false;
            }
        });
    }
}
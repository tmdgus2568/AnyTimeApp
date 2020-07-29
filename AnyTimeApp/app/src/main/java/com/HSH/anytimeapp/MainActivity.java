package com.HSH.anytimeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    Context context = this;
    private HomeFragment homeFragment;
    private CalendarFragment calendarFragment;
    private BoardFragment boardFragment;
    private BellFragment bellFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeFragment = new HomeFragment();
        calendarFragment = new CalendarFragment();
        boardFragment = new BoardFragment();
        bellFragment = new BellFragment();
        fragmentManager = getSupportFragmentManager();
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_layout, homeFragment).commitAllowingStateLoss();
        bottomNavigationView.setOnNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        transaction = fragmentManager.beginTransaction();
        switch (item.getItemId()){
            case R.id.navigation_home:
                transaction.replace(R.id.main_layout, homeFragment).commitAllowingStateLoss();
                return true;
            case R.id.navigation_calendar:
                transaction.replace(R.id.main_layout, calendarFragment).commitAllowingStateLoss();
                return true;
            case R.id.navigation_board:
                transaction.replace(R.id.main_layout, boardFragment).commitAllowingStateLoss();
                return true;
            case R.id.navigation_bell:
                transaction.replace(R.id.main_layout, bellFragment).commitAllowingStateLoss();
                return true;
        }
        return false;
    }
}
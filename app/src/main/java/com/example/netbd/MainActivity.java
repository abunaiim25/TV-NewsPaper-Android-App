package com.example.netbd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.netbd.Fragments.HomeFragment;
import com.example.netbd.Fragments.NewsPaperFragment;
import com.example.netbd.Fragments.RadioFragment;
import com.example.netbd.Fragments.TvFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView=findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home)
                {
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, homeFragment);
                    fragmentTransaction.commit();
                }
                else if (id == R.id.tv)
                {
                    TvFragment tvFragment = new TvFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, tvFragment);
                    fragmentTransaction.commit();
                }
                /*else if (id == R.id.radio) {
                    RadioFragment radioFragment = new RadioFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, radioFragment);
                    fragmentTransaction.commit();
                }*/
                else if (id == R.id.newsPaper) {
                    NewsPaperFragment newsPaperFragment = new NewsPaperFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, newsPaperFragment);
                    fragmentTransaction.commit();
                }



                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.home);


    }
}
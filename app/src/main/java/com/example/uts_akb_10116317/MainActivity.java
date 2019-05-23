package com.example.uts_akb_10116317;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.uts_akb_10116317.fragments.PageFragment;
import com.example.uts_akb_10116317.fragments.PageFragment2;
import com.example.uts_akb_10116317.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

        /** 18 Mei 2019
         *
         */
        private ViewPager pager;
        private PagerAdapter pagerAdapter;


        @Override
        protected void onCreate(Bundle savedInstancesState) {
                super.onCreate(savedInstancesState);
                setContentView(R.layout.activity_main);

                /** 18 Mei 2019
                 view pager*
                 */
                List<Fragment> list = new ArrayList<>();
                list.add(new PageFragment());
                list.add(new PageFragment2());
                list.add(new PageFragment3());

                pager = findViewById(R.id.pager);
                pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), list);

                pager.setAdapter(pagerAdapter);


        }

    public void Masuk(View view) {
            Intent intent = new Intent(MainActivity.this, ButtonClass.class);
            startActivity(intent);

    }
}


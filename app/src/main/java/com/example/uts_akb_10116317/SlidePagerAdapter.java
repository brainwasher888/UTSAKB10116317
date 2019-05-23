package com.example.uts_akb_10116317;

/** 18 Mei 2019
 *
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Button;

import java.util.List;

public class SlidePagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragementList;

    public SlidePagerAdapter(FragmentManager fm,List<Fragment> fragementList){
        super(fm);
        this.fragementList = fragementList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragementList.get(position);
    }

    @Override
    public int getCount() {
        return fragementList.size();
    }

}




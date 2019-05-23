package com.example.uts_akb_10116317.fragments;

/** 18 Mei 2019
 *
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.uts_akb_10116317.ButtonClass;
import com.example.uts_akb_10116317.MainActivity;
import com.example.uts_akb_10116317.R;


public class PageFragment3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.page_3, container, false);

        return rootView;

    }


}

package com.example.android.mhwapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

/**
 * Created by jesus on 21/09/2017.
 */

public class ArmasActivity extends  MainActivity {

    ViewPager viewPagerArmas;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armas_activity);

        // Lo relacionado con el ViewPager de armas:
        viewPagerArmas = (ViewPager) findViewById(R.id.armasViewPager);

        ViewPagerAdapter ViewPagerAdapterArmas = new ViewPagerAdapter(this);
        viewPagerArmas.setAdapter(ViewPagerAdapterArmas);
    }


}

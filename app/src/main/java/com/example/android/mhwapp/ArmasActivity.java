package com.example.android.mhwapp;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

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

        ViewPagerAdapterArmas ViewPagerAdapterArmas = new ViewPagerAdapterArmas(this);
        viewPagerArmas.setAdapter(ViewPagerAdapterArmas);

        ImageView leftNav = (ImageView) findViewById(R.id.left_nav);
        ImageView rightNav = (ImageView) findViewById(R.id.right_nav);

        leftNav.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        ImageView view = (ImageView) v;
                        //overlay is black with transparency of 0x77 (119)
                        view.getDrawable().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                        view.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        ImageView view = (ImageView) v;
                        //clear the overlay
                        view.getDrawable().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return false;
            }
        });



        leftNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewPagerArmas.getCurrentItem();
                    tab--;
                    viewPagerArmas.setCurrentItem(tab);
            }
        });

        rightNav.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        ImageView view = (ImageView) v;
                        //overlay is black with transparency of 0x77 (119)
                        view.getDrawable().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                        view.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        ImageView view = (ImageView) v;
                        //clear the overlay
                        view.getDrawable().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return false;
            }
        });

        rightNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewPagerArmas.getCurrentItem();
                tab++;
                viewPagerArmas.setCurrentItem(tab);

            }
        });


    }


}

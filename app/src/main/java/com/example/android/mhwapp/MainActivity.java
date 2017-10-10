package com.example.android.mhwapp;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

import static com.example.android.mhwapp.R.id.viewPager;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPagerMenu;
    LinearLayout sliderDotsPanel;
    private int dotscount;
    private ImageView[] dots;
    public MediaPlayer mp;
    int lenght;
    public static boolean shouldPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shouldPlay = false;
        mp = MediaPlayer.create(getApplicationContext(), R.raw.val_habar_main_theme);
        mp.setLooping(true);
        mp.start();

        // OnTouchListener para efecto de click y OnClickListener para la Intent de Armas.
        ImageView armas = (ImageView) findViewById(R.id.armas);

        armas.setOnTouchListener(new View.OnTouchListener() {
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



        armas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent armasIntent = new Intent(MainActivity.this, ArmasActivity.class);

                startActivity(armasIntent);
            }
        });

        // OnTouchListener para efecto de click y OnClickListener para la Intent de Bestiario.
        ImageView bestiario = (ImageView) findViewById(R.id.bestiario);
        bestiario.setOnTouchListener(new View.OnTouchListener() {
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

        bestiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bestiarioIntent = new Intent(MainActivity.this, BestiarioActivity.class);

                startActivity(bestiarioIntent);
            }
        });

        // OnTouchListener para efecto de click y OnClickListener para la Intent de Historia.
        ImageView historia = (ImageView) findViewById(R.id.historia);
        historia.setOnTouchListener(new View.OnTouchListener() {
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

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent historiaIntent = new Intent(MainActivity.this, HistoriaActivity.class);

                startActivity(historiaIntent);

            }
        });

        // OnTouchListener para efecto de click y OnClickListener para la Intent de Q&A.
        ImageView qna = (ImageView) findViewById(R.id.qna);
        qna.setOnTouchListener(new View.OnTouchListener() {
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

        qna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qnaIntent = new Intent(MainActivity.this, QnaActivity.class);

                startActivity(qnaIntent);

            }
        });

        ImageView musicButton = (ImageView) findViewById(R.id.music_button);
        musicButton.setOnTouchListener(new View.OnTouchListener() {
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

        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicIntent = new Intent(MainActivity.this, myRadioGroup.class);

                startActivity(musicIntent);
            }
        });





        // Lo relacionado al ViewPager del menú:
        viewPagerMenu = (ViewPager) findViewById(viewPager);

        sliderDotsPanel = (LinearLayout) findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPagerMenu.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotsPanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPagerMenu.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 6000, 7000);

    }

    @Override
    protected void onStop() {
        super.onStop();
        if (shouldPlay == false) {
            mp.pause();
            lenght = mp.getCurrentPosition();
        }
    }



    @Override
    protected void onResume() {
        super.onResume();
        mp.seekTo(lenght);
        mp.start();
    }



    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPagerMenu.getCurrentItem() == 0){
                        viewPagerMenu.setCurrentItem(1);
                    } else if (viewPagerMenu.getCurrentItem() == 1){
                        viewPagerMenu.setCurrentItem(2);
                    } else if (viewPagerMenu.getCurrentItem() == 2) {
                        viewPagerMenu.setCurrentItem(3);
                    } else if (viewPagerMenu.getCurrentItem() == 3) {
                        viewPagerMenu.setCurrentItem(4);
                    } else {
                        viewPagerMenu.setCurrentItem(0);
                    }
                }
            });
        }
    }
}

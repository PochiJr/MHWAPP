package com.example.android.mhwapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.widget.RadioGroup;

/**
 * Created by jesus on 26/09/2017.
 */

public class myRadioGroup extends MainActivity {

    private RadioGroup radioGroup;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_group);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.none) {
                    // Stop music
                } else if (checkedId == R.id.val_habar_default_theme){
                    mp.release();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.val_habar_main_theme);
                    mp.start();
                } else if (checkedId == R.id.cancion_triunfo) {
                    mp.release();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.mh3u_cancion_del_triunfo);
                    mp.start();
                } else if (checkedId == R.id.canal_helado){
                    mp.release();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.canal_helado_batalla);
                    mp.start();
                } else if (checkedId == R.id.tema_gremio_4){
                    mp.release();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.mh4u_tema_gremio_4);
                    mp.start();
                } else if (checkedId == R.id.lagiacrus){
                    mp.release();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.mh3u_lagiacrus_theme);
                    mp.start();
                } else if (checkedId == R.id.zinogre){
                    mp.release();
                    mp = MediaPlayer.create(getApplicationContext(), R.raw.mh4u_zinogre_theme);
                    mp.start();
                }

            }
        });
    }
}

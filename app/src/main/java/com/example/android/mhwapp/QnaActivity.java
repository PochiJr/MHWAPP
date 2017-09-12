package com.example.android.mhwapp;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jesus on 07/09/2017.
 */

public class QnaActivity  extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qna_activity);

        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        ImageView sobre = (ImageView) findViewById(R.id.sobre);

        sobre.setOnTouchListener(new View.OnTouchListener() {
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

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
                mailIntent.setType("text/plain");
                mailIntent.setData(Uri.parse("mailto: jesus-vegui@gmail.com"));
                startActivity(mailIntent);

            }
        });

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("¿Por qué la App está a medias?");
        listDataHeader.add("¿Por qué tus menús suelen llevar a otras guías en vez de hacer la tuya propia? ");
        listDataHeader.add("¿Por qué faltan tantos enemigos en el bestiario?");
        listDataHeader.add("¿Tienes pensado traducir la aplicación a más idiomas?");
        listDataHeader.add("He encontrado un error en la App ¿Puedo contactar contigo?");

        List<String> q1 = new ArrayList<>();
        q1.add("Sencillo. Pablo me ha pedido que tenga esto para esta noche así que tengo que poner preguntas de relleno como esta.");

        List<String> q2 = new ArrayList<>();
        q2.add("Me gustaría hacer las mías propias, pienso que tengo suficiente experiencia en este juego como para hacer una propia, pero es una funcionalidad que me gustaría ir implementando poco a poco, pues, no quiero hacer la App demasiado pesada.");

        List<String> q3 = new ArrayList<>();
        q3.add("Si pusiera todos la App pesaría tanto que no valdría la pena instalarla, prefiero añadirlos todos cuando sepa almacenar sus fotos y datos en una base de datos, por ahora están estos pocos como prueba.");

        List<String> q4 = new ArrayList<>();
        q4.add("En principio me gustaría implementar la idea, con algo de tiempo podría lograrlo, pero pensad que tendría que cambiar los textos de las imágenes al del idioma en cuestión y eso implica hacer la imagen de nuevo, es bastante curro, pero no digo que no a la idea.");

        List<String> q5 = new ArrayList<>();
        q5.add("Sin ningún problema, esta App está en constante desarrollo y mejora, por lo que cualquier error o sugerencia que queráis reportar podéis hacerlo pulsando el icono de contacto de abajo a la derecha, ¡No seáis muy malos conmigo!");

        listHash.put(listDataHeader.get(0),q1);
        listHash.put(listDataHeader.get(1),q2);
        listHash.put(listDataHeader.get(2),q3);
        listHash.put(listDataHeader.get(3),q4);
        listHash.put(listDataHeader.get(4),q5);
    }
}

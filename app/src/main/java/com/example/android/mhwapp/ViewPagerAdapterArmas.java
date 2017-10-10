package com.example.android.mhwapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by jesus on 24/08/2017.
 */

public class ViewPagerAdapterArmas extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.mipmap.vp0_armas, R.mipmap.vp1_armas, R.mipmap.vp2_armas, R.mipmap.vp3_armas, R.mipmap.vp4_armas};

    public ViewPagerAdapterArmas(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout_armas, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewArmas);
        imageView.setImageResource(images[position]);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){
                    Uri uri = Uri.parse("http://es.monsterhunter.wikia.com/wiki/Espadas_Dobles");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                } else if (position == 1){
                    Uri uri = Uri.parse("http://es.monsterhunter.wikia.com/wiki/Gran_Espada");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                } else if (position == 2){
                    Uri uri = Uri.parse("http://es.monsterhunter.wikia.com/wiki/Martillo");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                } else if (position == 3) {
                    Uri uri = Uri.parse("http://es.monsterhunter.wikia.com/wiki/Ballesta_Pesada");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                } else {
                    Uri uri = Uri.parse("http://es.monsterhunter.wikia.com/wiki/Glaive_Insecto");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                }

            }
        });

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }

}

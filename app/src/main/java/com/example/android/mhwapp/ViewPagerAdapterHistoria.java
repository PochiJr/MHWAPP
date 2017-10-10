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
 * Created by jesus on 23/09/2017.
 */

public class ViewPagerAdapterHistoria extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.mipmap.vp0_historia, R.mipmap.vp1_historia, R.mipmap.vp2_historia};

    public ViewPagerAdapterHistoria(Context context){
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
        View view = layoutInflater.inflate(R.layout.custom_layout_historia, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewHistoria);
        imageView.setImageResource(images[position]);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){
                    Uri uri = Uri.parse("http://www.3djuegos.com/comunidad-foros/tema/23383195/0/misiones-obligatorias-mh3u-moga-y-tanzia/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                } else if (position == 1){
                    Uri uri = Uri.parse("http://www.3djuegos.com/foros/tema/35391528/0/misiones-obligatorias-y-urgentes-mh4u/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    context.startActivity(intent);
                } else {
                    Uri uri = Uri.parse("http://www.3djuegos.com/foros/tema/43059855/0/misiones-obligatorias-y-paginas-de-ayuda/");
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

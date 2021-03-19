package com.example.artistgallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private ArrayList<Integer> obras;
    private String nomArtista;

    public ImageAdapter(Context mContext, ArrayList<Integer> obras, String nomArtista) {
        this.mContext = mContext;
        this.obras = obras;
        this.nomArtista = nomArtista;
    }

    @Override
    public int getCount() {
        return obras.size();
    }



    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        PhotoView photoView = new PhotoView(container.getContext());
        photoView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        photoView.setImageResource(obras.get(position));

        container.addView(photoView,0);
        return photoView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((ImageView) object);
    }
}

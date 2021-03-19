package com.example.artistgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private ArrayList<Integer> obras ;
   private TextView nomArtista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        nomArtista = findViewById(R.id.textViewNomArtitaObres);

        obras  = getIntent().getIntegerArrayListExtra("fotosObres");
        nomArtista.setText(getIntent().getExtras().getString("nom"));



        ViewPager viewPager = findViewById(R.id.viewpage);
        ImageAdapter imageAdapter = new ImageAdapter(this,obras,nomArtista.toString());
        viewPager.setAdapter(imageAdapter);

    }
}
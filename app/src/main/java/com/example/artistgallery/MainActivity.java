package com.example.artistgallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    Myadapter myadapter;

    ArrayList<Artist> artists = new ArrayList<>(Arrays.asList(
            new Artist("Vincent van gogh", R.drawable.vincentvangogh_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.go01
                            , R.drawable.go02
                            , R.drawable.go03
                            , R.drawable.go
                            , R.drawable.go4

                    )))
                ,new Artist("Vasili_Kandinski", R.drawable.vasili_kandinski_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.vas01
                            , R.drawable.vas02
                            , R.drawable.vas03
                            , R.drawable.vas04

                    )))
            ,new Artist("rembrandt", R.drawable.rembrandt_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.rem01
                            , R.drawable.rem02
                            , R.drawable.rem03
                            , R.drawable.rem04
                            , R.drawable.rem05
                    )))
            ,
            new Artist("Renoir", R.drawable.renoir_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.r01
                            , R.drawable.r02
                            , R.drawable.r03
                            , R.drawable.r04
                            , R.drawable.r05
                    )))
            ,
            new Artist("Joan Miro", R.drawable.joan_miro_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.jm01
                            , R.drawable.jm02
                            , R.drawable.jm03
                            , R.drawable.jm04
                            , R.drawable.jm05
                    )))
           , new Artist("Frida Kahlo", R.drawable.gustav_klimt_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.g02
                            , R.drawable.g03
                            , R.drawable.g04
                            , R.drawable.g05
                    )))

            ,new Artist("Frida Kahlo", R.drawable.frida_kahlo_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.fr01
                            , R.drawable.fr02
                            , R.drawable.fr03
                            , R.drawable.fr04
                            , R.drawable.fr05
                    )))
            ,new Artist("Eduard Mane", R.drawable.edouard_mane_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.ed01
                            , R.drawable.ed02
                            , R.drawable.ed03
                            , R.drawable.ed04
                            , R.drawable.ed05
                    )))
            ,new Artist("Diego Velazquez", R.drawable.diegoelazquez_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.dv01
                            , R.drawable.dv02
                            , R.drawable.dv03
                            , R.drawable.dv04
                            , R.drawable.dv05
                    )))

            ,new Artist("Claude Monet", R.drawable.claude_monet_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.cm01

                            , R.drawable.cm05
                    )))


            , new Artist("Picasso", R.drawable.picasso_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.picasso_amor_fama_tragedia
                            , R.drawable.picasso_gueridon
                            , R.drawable.picasso_sennyoritas
                            , R.drawable.picasso_vino
                            , R.drawable.dali_santantonio)))

            , new Artist("Dali", R.drawable.dali_profile,
                    new ArrayList<>(Arrays.asList(
                            R.drawable.dali_desintegracion_persistencia
                            , R.drawable.dali_cisnesreflejoelefantes
                            , R.drawable.dali_loselefantes
                            , R.drawable.dali_metamorfosis_narciso
                            , R.drawable.dali_santantonio)))
            ));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        myadapter = new Myadapter(artists, this);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
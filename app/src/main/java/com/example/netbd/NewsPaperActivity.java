package com.example.netbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.netbd.NewsPaperWeb.AmaderSomoy;
import com.example.netbd.NewsPaperWeb.Deshrupantor;
import com.example.netbd.NewsPaperWeb.Ittefaq;
import com.example.netbd.NewsPaperWeb.Jonokhonto;
import com.example.netbd.NewsPaperWeb.Jugantor;
import com.example.netbd.NewsPaperWeb.Kalerkantho;
import com.example.netbd.NewsPaperWeb.Manobkhontho;
import com.example.netbd.NewsPaperWeb.Noyadigonto;
import com.example.netbd.NewsPaperWeb.Sangram;
import com.example.netbd.NewsPaperWeb.Somokal;
import com.example.netbd.NewsPaperWeb.Thedailystar;
import com.example.netbd.NewsPaperWeb.Vorercagog;

public class NewsPaperActivity extends AppCompatActivity {

    //News Paper
    private CardView amadersomoy,kalerkantho,ittefaq,somokal,noyadigonto,jugantor,jonokhonto ;
    private CardView thedailystar,manobkhontho,deshrupantor,vorercagog,sangram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_paper);


        //newspaper
        amadersomoy=findViewById(R.id.amadersomoy);
        kalerkantho=findViewById(R.id.kalerkantho);
        ittefaq=findViewById(R.id.ittefaq);
        somokal=findViewById(R.id.somokal);
        noyadigonto=findViewById(R.id.noyadigonto);
        jugantor=findViewById(R.id.jugantor);
        jonokhonto=findViewById(R.id.jonokhonto);
        thedailystar=findViewById(R.id.thedailystar);
        manobkhontho=findViewById(R.id.manobkhontho);
        deshrupantor=findViewById(R.id.deshrupantor);
        vorercagog=findViewById(R.id.vorercagog);
        sangram=findViewById(R.id.sangram);




        amadersomoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, AmaderSomoy.class);
                intent.putExtra("link","https://www.dainikamadershomoy.com/");
                startActivity(intent);
            }
        });

        kalerkantho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Kalerkantho.class);
                intent.putExtra("link","https://www.kalerkantho.com/");
                startActivity(intent);
            }
        });

        ittefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Ittefaq.class);
                intent.putExtra("link","https://www.ittefaq.com.bd/");
                startActivity(intent);
            }
        });

        somokal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Somokal.class);
                intent.putExtra("link","https://samakal.com/");
                startActivity(intent);
            }
        });

        noyadigonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Noyadigonto.class);
                intent.putExtra("link","https://www.dailynayadiganta.com/");
                startActivity(intent);
            }
        });

        jugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Jugantor.class);
                intent.putExtra("link","https://www.jugantor.com/");
                startActivity(intent);
            }
        });

        jonokhonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Jonokhonto.class);
                intent.putExtra("link","https://www.dailyjanakantha.com/");
                startActivity(intent);
            }
        });

        thedailystar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Thedailystar.class);
                intent.putExtra("link","https://www.thedailystar.net/bangla/");
                startActivity(intent);
            }
        });

        manobkhontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Manobkhontho.class);
                intent.putExtra("link","https://mzamin.com/");
                startActivity(intent);
            }
        });

        deshrupantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Deshrupantor.class);
                intent.putExtra("link","https://www.deshrupantor.com/");
                startActivity(intent);
            }
        });

        vorercagog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Vorercagog.class);
                intent.putExtra("link","https://www.bhorerkagoj.com/");
                startActivity(intent);
            }
        });

        sangram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NewsPaperActivity.this, Sangram.class);
                intent.putExtra("link","https://dailysangram.com/");
                startActivity(intent);
            }
        });



    }
}
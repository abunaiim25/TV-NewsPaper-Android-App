package com.example.netbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.netbd.Channels.ATN;
import com.example.netbd.Channels.ATVIslamic;
import com.example.netbd.Channels.Aljazeera;
import com.example.netbd.Channels.AsianTv;
import com.example.netbd.Channels.BBC;
import com.example.netbd.Channels.BTV;
import com.example.netbd.Channels.BanglaVision;
import com.example.netbd.Channels.BijoyTv;
import com.example.netbd.Channels.Boishakhi;
import com.example.netbd.Channels.Channel24;
import com.example.netbd.Channels.Channel_9;
import com.example.netbd.Channels.Channel_I;
import com.example.netbd.Channels.ColorsBangla;
import com.example.netbd.Channels.DBC;
import com.example.netbd.Channels.FoxLife;
import com.example.netbd.Channels.Jamuna;
import com.example.netbd.Channels.News24;
import com.example.netbd.Channels.RTVMusic;
import com.example.netbd.Channels.Desh;
import com.example.netbd.Channels.ETV;
import com.example.netbd.Channels.Independent;
import com.example.netbd.Channels.Mohona;
import com.example.netbd.Channels.Mokka;
import com.example.netbd.Channels.MyTv;
import com.example.netbd.Channels.SATv;
import com.example.netbd.Channels.Somoy;
import com.example.netbd.Channels.Sonshod;

public class TvActivity extends AppCompatActivity {

    //TV
    private CardView channel_i, channel24, independent, channel9,etv,btv,boishakhi,atn,mokka,asintv,banglavision,rtvmusic;
    private CardView bijoytv,satv,mytv,mohona,dash,atnislamic,songsodtv,colorsbangla,somoy,jomuna,dbc,news24,aljajira,foxlife,bbc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);

        //TV
        channel_i=findViewById(R.id.channel_i);
        channel24=findViewById(R.id.channel24);
        independent=findViewById(R.id.independent);
        channel9=findViewById(R.id.channel_9);
        etv=findViewById(R.id.etv);
        btv=findViewById(R.id.btv);
        boishakhi=findViewById(R.id.boishakhi);
        atn=findViewById(R.id.atn);
        mokka=findViewById(R.id.mokka);
        bijoytv=findViewById(R.id.bijoytv);
        satv=findViewById(R.id.satv);
        mytv=findViewById(R.id.mytv);
        mohona=findViewById(R.id.mohona);
        dash=findViewById(R.id.dash);
        atnislamic=findViewById(R.id.atnislamic);
        songsodtv=findViewById(R.id.songsodtv);
        colorsbangla=findViewById(R.id.colorsbangla);
        somoy=findViewById(R.id.somoy);
        jomuna=findViewById(R.id.jomuna);
        dbc=findViewById(R.id.dbc);
        news24=findViewById(R.id.news24);
        aljajira=findViewById(R.id.aljajira);
        foxlife=findViewById(R.id.foxlife);
        bbc=findViewById(R.id.bbc);
        asintv=findViewById(R.id.asintv);
        banglavision=findViewById(R.id.banglavision);
        rtvmusic=findViewById(R.id.rtvmusic);






        channel_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Channel_I.class);
                startActivity(intent);
            }
        });

        independent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Independent.class);
                startActivity(intent);
            }
        });

        channel24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Channel24.class);
                startActivity(intent);
            }
        });

        channel9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Channel_9.class);
                startActivity(intent);
            }
        });

        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, ETV.class);
                startActivity(intent);
            }
        });

        btv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BTV.class);
                startActivity(intent);
            }
        });

        boishakhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Boishakhi.class);
                startActivity(intent);
            }
        });

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, ATN.class);
                startActivity(intent);
            }
        });

        mokka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Mokka.class);
                startActivity(intent);
            }
        });

        bijoytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BijoyTv.class);
                startActivity(intent);
            }
        });

        satv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, SATv.class);
                startActivity(intent);
            }
        });

        mytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, MyTv.class);
                startActivity(intent);
            }
        });

        mohona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Mohona.class);
                startActivity(intent);
            }
        });

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Desh.class);
                startActivity(intent);
            }
        });

        atnislamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, ATVIslamic.class);
                startActivity(intent);
            }
        });

        songsodtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Sonshod.class);
                startActivity(intent);
            }
        });

        colorsbangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, ColorsBangla.class);
                startActivity(intent);
            }
        });

        asintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, AsianTv.class);
                startActivity(intent);
            }
        });

        banglavision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BanglaVision.class);
                startActivity(intent);
            }
        });

        rtvmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, RTVMusic.class);
                startActivity(intent);
            }
        });

        somoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Somoy.class);
                startActivity(intent);
            }
        });


        jomuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Jamuna.class);
                startActivity(intent);
            }
        });



        dbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, DBC.class);
                startActivity(intent);
            }
        });

        news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, News24.class);
                startActivity(intent);
            }
        });

        aljajira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Aljazeera.class);
                startActivity(intent);
            }
        });


        foxlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, FoxLife.class);
                startActivity(intent);
            }
        });

        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BBC.class);
                startActivity(intent);
            }
        });


    }
}
package com.example.netbd.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
import com.example.netbd.Channels.Desh;
import com.example.netbd.Channels.ETV;
import com.example.netbd.Channels.FoxLife;
import com.example.netbd.Channels.Independent;
import com.example.netbd.Channels.Jamuna;
import com.example.netbd.Channels.Mohona;
import com.example.netbd.Channels.Mokka;
import com.example.netbd.Channels.MyTv;
import com.example.netbd.Channels.News24;
import com.example.netbd.Channels.RTVMusic;
import com.example.netbd.Channels.SATv;
import com.example.netbd.Channels.Somoy;
import com.example.netbd.Channels.Sonshod;
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
import com.example.netbd.R;
import com.example.netbd.TvActivity;


public class TvFragment extends Fragment {

    //TV
    private CardView channel_i, channel24, independent, channel9,etv,btv,boishakhi,atn,mokka,asintv,banglavision,rtvmusic;
    private CardView bijoytv,satv,mytv,mohona,dash,atnislamic,songsodtv,colorsbangla,somoy,jomuna,dbc,news24,aljajira,foxlife,bbc;



    public TvFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv,container,false);


        //TV
        channel_i= view.findViewById(R.id.channel_i);
        channel24= view.findViewById(R.id.channel24);
        independent= view.findViewById(R.id.independent);
        channel9= view.findViewById(R.id.channel_9);
        etv= view.findViewById(R.id.etv);
        btv= view.findViewById(R.id.btv);
        boishakhi= view.findViewById(R.id.boishakhi);
        atn= view.findViewById(R.id.atn);
        mokka= view.findViewById(R.id.mokka);
        bijoytv= view.findViewById(R.id.bijoytv);
        satv= view.findViewById(R.id.satv);
        mytv= view.findViewById(R.id.mytv);
        mohona= view.findViewById(R.id.mohona);
        dash= view.findViewById(R.id.dash);
        atnislamic= view.findViewById(R.id.atnislamic);
        songsodtv= view.findViewById(R.id.songsodtv);
        colorsbangla= view.findViewById(R.id.colorsbangla);
        somoy= view.findViewById(R.id.somoy);
        jomuna= view.findViewById(R.id.jomuna);
        dbc= view.findViewById(R.id.dbc);
        news24= view.findViewById(R.id.news24);
        aljajira= view.findViewById(R.id.aljajira);
        foxlife= view.findViewById(R.id.foxlife);
        bbc= view.findViewById(R.id.bbc);
        asintv= view.findViewById(R.id.asintv);
        banglavision= view.findViewById(R.id.banglavision);
        rtvmusic= view.findViewById(R.id.rtvmusic);


        channel_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Channel_I.class);
                startActivity(intent);
            }
        });

        independent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Independent.class);
                startActivity(intent);
            }
        });

        channel24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Channel24.class);
                startActivity(intent);
            }
        });

        channel9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Channel_9.class);
                startActivity(intent);
            }
        });

        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ETV.class);
                startActivity(intent);
            }
        });

        btv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BTV.class);
                startActivity(intent);
            }
        });

        boishakhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Boishakhi.class);
                startActivity(intent);
            }
        });

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ATN.class);
                startActivity(intent);
            }
        });

        mokka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Mokka.class);
                startActivity(intent);
            }
        });

        bijoytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BijoyTv.class);
                startActivity(intent);
            }
        });

        satv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SATv.class);
                startActivity(intent);
            }
        });

        mytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MyTv.class);
                startActivity(intent);
            }
        });

        mohona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Mohona.class);
                startActivity(intent);
            }
        });

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Desh.class);
                startActivity(intent);
            }
        });

        atnislamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ATVIslamic.class);
                startActivity(intent);
            }
        });

        songsodtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Sonshod.class);
                startActivity(intent);
            }
        });

        colorsbangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ColorsBangla.class);
                startActivity(intent);
            }
        });

        asintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AsianTv.class);
                startActivity(intent);
            }
        });

        banglavision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BanglaVision.class);
                startActivity(intent);
            }
        });

        rtvmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RTVMusic.class);
                startActivity(intent);
            }
        });

        somoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Somoy.class);
                startActivity(intent);
            }
        });


        jomuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Jamuna.class);
                startActivity(intent);
            }
        });



        dbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DBC.class);
                startActivity(intent);
            }
        });

        news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), News24.class);
                startActivity(intent);
            }
        });

        aljajira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Aljazeera.class);
                startActivity(intent);
            }
        });


        foxlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FoxLife.class);
                startActivity(intent);
            }
        });

        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BBC.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
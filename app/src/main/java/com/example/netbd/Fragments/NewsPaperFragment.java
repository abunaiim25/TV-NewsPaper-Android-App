package com.example.netbd.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netbd.NewsPaperActivity;
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


public class NewsPaperFragment extends Fragment {

    //News Paper
    private CardView amadersomoy,kalerkantho,ittefaq,somokal,noyadigonto,jugantor,jonokhonto ;
    private CardView thedailystar,manobkhontho,deshrupantor,vorercagog,sangram;




    public NewsPaperFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_paper,container,false);


        //newspaper
        amadersomoy=view.findViewById(R.id.amadersomoy);
        kalerkantho=view.findViewById(R.id.kalerkantho);
        ittefaq=view.findViewById(R.id.ittefaq);
        somokal=view.findViewById(R.id.somokal);
        noyadigonto=view.findViewById(R.id.noyadigonto);
        jugantor=view.findViewById(R.id.jugantor);
        jonokhonto=view.findViewById(R.id.jonokhonto);
        thedailystar=view.findViewById(R.id.thedailystar);
        manobkhontho=view.findViewById(R.id.manobkhontho);
        deshrupantor=view.findViewById(R.id.deshrupantor);
        vorercagog=view.findViewById(R.id.vorercagog);
        sangram=view.findViewById(R.id.sangram);


        amadersomoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), AmaderSomoy.class);
                intent.putExtra("link","https://www.dainikamadershomoy.com/");
                startActivity(intent);
            }
        });

        kalerkantho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Kalerkantho.class);
                intent.putExtra("link","https://www.kalerkantho.com/");
                startActivity(intent);
            }
        });

        ittefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Ittefaq.class);
                intent.putExtra("link","https://www.ittefaq.com.bd/");
                startActivity(intent);
            }
        });

        somokal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Somokal.class);
                intent.putExtra("link","https://samakal.com/");
                startActivity(intent);
            }
        });

        noyadigonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Noyadigonto.class);
                intent.putExtra("link","https://www.dailynayadiganta.com/");
                startActivity(intent);
            }
        });

        jugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Jugantor.class);
                intent.putExtra("link","https://www.jugantor.com/");
                startActivity(intent);
            }
        });

        jonokhonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Jonokhonto.class);
                intent.putExtra("link","https://www.dailyjanakantha.com/");
                startActivity(intent);
            }
        });

        thedailystar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Thedailystar.class);
                intent.putExtra("link","https://www.thedailystar.net/bangla/");
                startActivity(intent);
            }
        });

        manobkhontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Manobkhontho.class);
                intent.putExtra("link","https://mzamin.com/");
                startActivity(intent);
            }
        });

        deshrupantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Deshrupantor.class);
                intent.putExtra("link","https://www.deshrupantor.com/");
                startActivity(intent);
            }
        });

        vorercagog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Vorercagog.class);
                intent.putExtra("link","https://www.bhorerkagoj.com/");
                startActivity(intent);
            }
        });

        sangram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Sangram.class);
                intent.putExtra("link","https://dailysangram.com/");
                startActivity(intent);
            }
        });





        return view;
    }
}
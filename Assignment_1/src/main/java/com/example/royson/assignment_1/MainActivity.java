package com.example.royson.assignment_1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import static com.example.royson.assignment_1.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Log.i("MainActivity", "onCreate");

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        final GetTheQuote getTheQuote = new GetTheQuote();
        fragmentTransaction.add(R.id.fragment_container, getTheQuote);
        fragmentTransaction.commit();



    }



}



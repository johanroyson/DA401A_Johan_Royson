package com.example.royson.assignment_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class SeeTheQuote extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.the_quote_layout_fragment, container, false);

        Log.i("SeeTheQuote", "onCreateView");

        TextView randQuote = (TextView) v.findViewById(R.id.randomQuotes);
        randQuote.setText(RandomQuote.getQuote());

        TextView getDate = (TextView) v.findViewById(R.id.todaysDate);
        getDate.setText(TheDate.getDate());



        return v;

    }


}

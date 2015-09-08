package com.example.royson.assignment_1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class SeeTheQuote extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.the_quote_layout_fragment, container, false);

        Log.i("SeeTheQuote", "onCreateView");

        TextView randQuote = (TextView) v.findViewById(R.id.randomQuotes);
        randQuote.setText(RandomQuote.getQuote());

        TextView getDate = (TextView) v.findViewById(R.id.todaysDate);
        getDate.setText(TheDate.getDate());

        Button buttonNewQuote = (Button) v.findViewById(R.id.new_quote_button);
        buttonNewQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                GetTheQuote getTheQuote = new GetTheQuote();
                fragmentTransaction.add(R.id.fragment_container, getTheQuote);
                fragmentTransaction.commit();

                Log.i("SeeTheQuote", "onClick");
            }
        });

        return v;

    }


}

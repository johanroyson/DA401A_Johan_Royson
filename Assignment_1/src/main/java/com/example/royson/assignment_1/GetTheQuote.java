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


public class GetTheQuote extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.get_quote_layout_fragment, container, false);
        Log.i("GetTheQuote", "onCreateView");

        Button buttonQuote = (Button) v.findViewById(R.id.button_for_quote);
        buttonQuote.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SeeTheQuote seeTheQuote = new SeeTheQuote();
                fragmentTransaction.replace(R.id.fragment_container, seeTheQuote);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                Log.i("GetTheQuote", "onClick");
            }
        });

        return v;


    }



}


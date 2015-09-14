package com.example.royson.assignment_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PlotFragment extends Fragment {

    public PlotFragment(){
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.plot_fragment, container, false);

        Bundle movieInfo = getArguments();

        ImageView fanart = (ImageView) view.findViewById(R.id.image_fanart);
        fanart.setImageResource(movieInfo.getInt("fanart"));

        TextView title  = (TextView) view.findViewById(R.id.the_title);
        title.setText(movieInfo.getString("title"));

        TextView year = (TextView) view.findViewById(R.id.the_year);
        year.setText(movieInfo.getString("year"));

        TextView plot = (TextView) view.findViewById(R.id.movie_plot);
        plot.setText(movieInfo.getString("plot"));



        return view;


    }
}

package com.example.royson.assignment_2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MovieAdapter extends BaseAdapter {

    ArrayList<Movie> mMovieList;
    LayoutInflater mLayoutInflater;

    public MovieAdapter(ArrayList<Movie> cMovieList, LayoutInflater cLayoutInflater){

        this.mLayoutInflater = cLayoutInflater;
        this.mMovieList = cMovieList;

    }

    @Override
    public int getCount() {
        return mMovieList.size();
    }

    @Override
    public Object getItem(int position) {
        return mMovieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.i("MovieAdapter", "GetView");

        convertView = mLayoutInflater.inflate(R.layout.movie_item, parent, false);

        Movie movie = (Movie) getItem(position);

        ImageView poster_ImageView = (ImageView) convertView.findViewById(R.id.the_poster);
        poster_ImageView.setImageResource(movie.poster);

        TextView title_TextView = (TextView) convertView.findViewById(R.id.the_title);
        title_TextView.setText(movie.title);

        TextView Year_TextView = (TextView) convertView.findViewById(R.id.the_year);
        Year_TextView.setText(movie.year);



        return convertView;
    }
}

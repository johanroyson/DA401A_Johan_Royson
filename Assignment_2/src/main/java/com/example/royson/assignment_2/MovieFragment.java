package com.example.royson.assignment_2;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


public class MovieFragment extends Fragment {

    ArrayList<Movie> mMovieList = new ArrayList<>();


    public MovieFragment() {

        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TypedArray movies = getResources().obtainTypedArray(R.array.movies);

        for (int i = 0; i < movies.length(); i++) {
            TypedArray movieArray = getResources().obtainTypedArray(movies.getResourceId(i, 0));
            Movie movie = new Movie(movieArray.getString(0), movieArray.getString(1), movieArray.getString(2), movieArray.getResourceId(4, 0), movieArray.getResourceId(3, 0));
            mMovieList.add(movie);
            movieArray.recycle();
        }
        movies.recycle();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);

        GridView gridview = (GridView) view.findViewById(R.id.movies_view);
        MovieAdapter adapter = new MovieAdapter(mMovieList, getActivity().getLayoutInflater());

        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                Movie moviesItems = mMovieList.get(position);

                Bundle bundle = new Bundle();

                Fragment moviePlot = new PlotFragment();

                bundle.putInt("fanart", moviesItems.fanart);
                bundle.putString("title", moviesItems.title);
                bundle.putString("year", moviesItems.year);
                bundle.putString("plot", moviesItems.plot);


                moviePlot.setArguments(bundle);

                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_container, moviePlot)
                        .addToBackStack(null)
                        .commit();

            }
        });


        return view;
    }
}
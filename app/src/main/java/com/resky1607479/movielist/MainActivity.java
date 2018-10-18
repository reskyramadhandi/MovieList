package com.resky1607479.movielist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvCategory;
    private ArrayList<Movie> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(MovieData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewMovieAdapter cardViewMovieAdapter = new CardViewMovieAdapter(this);
        cardViewMovieAdapter.setListMovie(list);
        rvCategory.setAdapter(cardViewMovieAdapter);
    }
}

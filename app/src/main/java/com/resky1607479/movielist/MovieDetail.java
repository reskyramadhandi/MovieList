package com.resky1607479.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MovieDetail extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_RATING = "extra_rating";
    public static String EXTRA_RELEASE = "extra_release";
    public static String EXTRA_DETAIL = "extra_detail";
    private TextView tvDataJudul, tvDataRating, tvDataRelease, tvDataDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String release = getIntent().getStringExtra(EXTRA_RELEASE);
        String rating = getIntent().getStringExtra(EXTRA_RATING);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);

        tvDataJudul = (TextView)findViewById(R.id.tv_title_show);
        tvDataJudul.setText(name);

        tvDataRating = (TextView)findViewById(R.id.tv_rate_show);
        tvDataRating.setText(rating);

        tvDataRelease = (TextView)findViewById(R.id.tv_release_show);
        tvDataRelease.setText(release);

        tvDataDetail = (TextView)findViewById(R.id.tv_detail_show);
        tvDataDetail.setText(detail);
    }
}


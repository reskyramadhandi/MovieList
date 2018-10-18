package com.resky1607479.movielist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder>
{
    private ArrayList<Movie> listMovie;
    private Context context;

    CardViewMovieAdapter(Context context) {
        this.context = context;
    }
    private ArrayList<Movie> getListMovie() {
        return listMovie;
    }
    void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_movielist, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position)
    {
        final Movie movie = getListMovie().get(position);
        Glide.with(context)
                .load(movie.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);
        holder.tvName.setText(movie.getName());
        holder.tvRelease.setText("Rilis: " + movie.getRelease());
        holder.tvRating.setText("Rating: " + movie.getRating());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MovieDetail.class);
                intent.putExtra(MovieDetail.EXTRA_NAME, movie.getName());
                intent.putExtra(MovieDetail.EXTRA_RATING, movie.getRating());
                intent.putExtra(MovieDetail.EXTRA_RELEASE, movie.getRelease());
                intent.putExtra(MovieDetail.EXTRA_DETAIL, movie.getDetail());

                context.startActivity(intent);
            }
        });



    }
    @Override
    public int getItemCount() {
        return getListMovie().size();
    }
    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRelease, tvRating;
        Button btnDetail;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRelease = (TextView)itemView.findViewById(R.id.tv_item_release);
            tvRating = (TextView)itemView.findViewById(R.id.tv_item_rating);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);

        }


    }

}

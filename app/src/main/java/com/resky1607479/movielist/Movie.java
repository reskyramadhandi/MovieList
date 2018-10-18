package com.resky1607479.movielist;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String name, release, rating, photo, detail;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRelease(){
        return release;
    }

    public void setRelease(String release){
        this.release = release;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.release);
        dest.writeString(this.rating);
        dest.writeString(this.photo);
        dest.writeString(this.detail);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.name = in.readString();
        this.release = in.readString();
        this.rating = in.readString();
        this.photo = in.readString();
        this.detail = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}

package com.example.series;

public class Series {
    String photo;
    String name;
    String min;
    String rating;
    public Series(String photo, String name, String email, String phone){
        this.photo = photo;
        this.name = name;
        this.min = min;
        this.rating = rating;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getMin() {
        return min;
    }

    public String getRating() {
        return rating;
    }
}

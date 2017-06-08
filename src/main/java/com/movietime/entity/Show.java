package com.movietime.entity;

public class Show {
    public long id;
    public long theater_id;
    public String theater_name;
    public String time;
    public int price;
    public long movie_id;
    public String[] seat_map;
    public String[] sold_seat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTheater_id() {
        return theater_id;
    }

    public void setTheater_id(long theater_id) {
        this.theater_id = theater_id;
    }

    public String getTheater_name() {
        return theater_name;
    }

    public void setTheater_name(String theater_name) {
        this.theater_name = theater_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(long movie_id) {
        this.movie_id = movie_id;
    }

    public String[] getSeat_map() {
        return seat_map;
    }

    public void setSeat_map(String[] seat_map) {
        this.seat_map = seat_map;
    }

    public String[] getSold_seat() {
        return sold_seat;
    }

    public void setSold_seat(String[] sold_seat) {
        this.sold_seat = sold_seat;
    }
}

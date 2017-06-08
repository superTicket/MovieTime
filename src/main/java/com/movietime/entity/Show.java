package com.movietime.entity;

<<<<<<< HEAD
import java.io.Serializable;

public class Show implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String theaterName;
    private String time;
    private int price;
    private long movieId;
    private String[] seatMap;
    private String[] soldSeat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
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

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String[] getSeatMap() {
        return seatMap;
    }

    public void setSeatMap(String[] seatMap) {
        this.seatMap = seatMap;
    }

    public String[] getSoldSeat() {
        return soldSeat;
    }

    public void setSoldSeat(String[] soldSeat) {
        this.soldSeat = soldSeat;
    }
=======
public class Show {
    public long id;
    public long theater_id;
    public String theater_name;
    public String time;
    public int price;
    public long movie_id;
    public String[] seat_map;
    public String[] sold_seat;
>>>>>>> origin/master
}

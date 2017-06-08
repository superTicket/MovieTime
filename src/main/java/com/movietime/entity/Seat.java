package com.movietime.entity;

<<<<<<< HEAD
import java.io.Serializable;

public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    private long showId;
    private int row;
    private int col;
    private boolean isBooked;

    public long getShowId() {
        return showId;
    }

    public void setShowId(long showId) {
        this.showId = showId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
=======
public class Seat {
    public long show_id;  // reference
    public int row;
    public int col;
    public boolean isBooked;
>>>>>>> origin/master
}

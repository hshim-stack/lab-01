package com.example.myapplication;
import java.util.Date;

public abstract class Mood {
    private Date date;

    // date as an default
    public Mood(){
        this.date = new Date();
    }

    // takes the date as an argument
    public Mood(Date date) {
     this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String mood();

}

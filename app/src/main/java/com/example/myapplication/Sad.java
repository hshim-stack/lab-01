package com.example.myapplication;
import java.util.Date;

public class Sad extends Mood {

    public Sad(Date date) {
        super(date);
    }


    public Sad(){
        super();
    }

    @Override
    public String mood(){
        return "Sad";
    }
}

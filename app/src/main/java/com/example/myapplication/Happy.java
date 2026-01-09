package com.example.myapplication;

import java.util.Date;

public class Happy extends Mood {

    // Constructor 1: default date (current date)
    public Happy() {
        super();
    }

    // Constructor 2: provided date
    public Happy(Date date) {
        super(date);
    }

    @Override
    public String mood() {
        return "Happy";
    }
}

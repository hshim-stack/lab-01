package com.example.myapplication;

import java.util.Date;

public abstract class Pet {

    private String name;
    private Date birthDate;

    // Constructor 1: name only, default birth date = current date
    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    // Constructor 2: name and birth date
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    // Abstract methods have no implementation and cannot be called directly.
    // They must be overridden by concrete subclasses before they can be used through objects of those subclasses.
    public abstract String speak();
}



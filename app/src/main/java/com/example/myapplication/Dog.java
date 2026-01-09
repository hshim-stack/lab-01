package com.example.myapplication;

public class Dog extends Pet implements Pettable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public void pet() {
        // Dog enjoys being petted
    }
}

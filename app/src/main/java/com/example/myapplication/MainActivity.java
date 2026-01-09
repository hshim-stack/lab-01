package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // cat
        Cat cat = new Cat("Lucy");

        // dog
        Dog dog = new Dog("Snoopy");

        // list of pets
        ArrayList<Pet> petList = new ArrayList<Pet>();
        // Can store both Cat and Dog objects
        // since they both inherit from Pet
        petList.add(cat);
        petList.add(dog);
        // scorpion
        Scorpion scorpion = new Scorpion("Scorponok");
        petList.add(scorpion);

        // interface
        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();  // use default date
        pettablePets.add(cat);
        pettablePets.add(dog);
        //pettablePets.add(scorpion); // This should produce an error but commented out
    }
}
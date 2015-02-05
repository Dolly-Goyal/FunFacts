package com.app.funfacts;

import java.util.Random;

/**
 * Created by DELL on 05-02-2015.
 */
public class FactBook {
    //Member
    String[]  facts = {
            "Dolly Goyal",
            "Deepika Jain",
            "Meenakshi meena",
            "Akshita jain",
            "Sakshi jain",
            "Rohita goyal",
            "Deepika goyal",
            "sneha aachriya",
            "Surbhi maheshwari",
            "Meenakshi rathore",
    };
    //method
    public String getFact() {

        
        // The Button was clicked, so update the fact label with a new fact
        String fact = "";
        // Randomly select the fact
        Random randomGenerator = new Random(); //construct a new random generator number
        int randomNumber = randomGenerator.nextInt(facts.length);

        fact = facts[randomNumber];
        return fact;

    }
}

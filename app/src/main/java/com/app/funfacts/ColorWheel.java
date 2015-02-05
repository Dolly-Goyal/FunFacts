package com.app.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by DELL on 05-02-2015.
 */
public class ColorWheel {
    //Member
   public String[] mColor = {
            "#334455",
            "#ffdd33",
            "#33ee55",
            "#ffffff",
            "#dd4467",
            "#667745",
            "#997867",
            "#ee2343",
            "#333333",
            "#448787",
    };
    //method
    public int getColor() {


        // The Button was clicked, so update the fact label with a new fact
        String color = "";
        // Randomly select the fact
        Random randomGenerator = new Random(); //construct a new random generator number
        int randomNumber = randomGenerator.nextInt(mColor.length);

        color = mColor[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;

    }
}

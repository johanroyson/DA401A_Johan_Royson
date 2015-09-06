package com.example.royson.assignment_1;

import android.util.Log;

import java.util.Arrays;
import java.util.Collections;


public class RandomQuote {
    public static String getQuote(){
        String[] myArray = {"If you can't make it good, at least make it look good.",
                            "Roses are red, violets are blue, I'm schizophrenic, and so am I.",
                            "A woman's mind is cleaner than a man's: She changes it more often."};
        Collections.shuffle(Arrays.asList(myArray));

        Log.i("RandomQuote", "getQuote");

        return myArray[0];
    }
}

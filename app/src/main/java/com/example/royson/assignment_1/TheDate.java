package com.example.royson.assignment_1;


import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TheDate {

    public static String getDate() {

        DateFormat df = new SimpleDateFormat("MM/dd/yyy");
        Date today = Calendar.getInstance().getTime();
        String reportDate;
        reportDate = df.format(today);

        Log.i("TheDate", "getDate");

        return (reportDate);

    }

}

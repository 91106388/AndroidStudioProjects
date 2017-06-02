package com.example.palmdigital.conslelog02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = " + myInt);
        double myDouble = setDoubleValue(); //myDouble should be set to 10.987
        Log.i("info", "myDouble = " + myDouble);

        Boolean myBoolean = setbooleanValue(); //should be false
        Log.i("info", "myBoolean = " + myBoolean);

        // declare a float variable called myFloat
        //set its value woth a function you write setFloatValue
        //have your function return the sum of two floats(4.5 + 2.3)
        //log myFloat out to Android Monitor logcat
        float myFloat = setFloat
    }
}

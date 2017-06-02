package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are outside the MainActivity class
// we are outside any methods

// Understanding how scope works is very important!!

public class MainActivity extends AppCompatActivity
{
    // in the MainActivity class, but I'm outside any methods

    // fields - these variable have classwide scope -- any code in the class can see
    //          and use these variables

    String myString;
    // declare a field that is a double named enemyHealth
    double enemyHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here, we are inside th onCreate() method, is inside
        // the  MainActivity class

        //when we 'declare' or 'define' a variable, we use the following format;
        //dataType variableName; <--- this is a variable doclaration/definition
        //Some examples;
        int myInt; // <--- this is a declaring a variable of dataType 'int' named 'myInt'
        double myDouble; // <--- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; // <-- this is declaring a variable of dataType 'TextView' named
                                         //textView_story
        ImageView imageView_ex; // <--- dataType is ImageView; variableName is imageView_ex

        // assigning a value to a declared variable
        // after we declare a variable, we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        //Some example
        myInt = 10; // <--- setting the value of myInt to 10, myInt has dataType 'int' & 10 is an int
        myDouble = 20.12; // myDouble gets the value 20.13
        textView_story = (TextView) findViewById(R.id.textView_st); // set the value of
                                                                // textView_story to the UI element
                                                                // R.id textView_story

        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);

        // you know you can declare and assign in the same step
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // some example
        int myInt2 = 25; // <--- this is a declaration AND assignment
        myInt2 = 50; // <--- this is only assignment
        // THE DIFFERENCE is the only dataType!!!!!!!! 'int'
        myString = "this is a string"; // <--- a declaration AND a an assignment
        myString = "this is another string!"; // this is just assignment

        // !!!!!!! Wherever you declare a variable determines that variable's scope!!!!!
        // in other words, if I declare a variable here int the onCreate() method, only
        // code in the onCreate() method can see it
        // nothing outside of onCreate() can see it...let's prove this

    }// end if the onCreate method

} // end of class

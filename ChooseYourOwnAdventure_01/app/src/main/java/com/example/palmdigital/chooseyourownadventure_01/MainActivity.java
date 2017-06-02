package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonLeft;
    Button buttonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference

        //Text refs
        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        buttonLeft  = (Button) findViewById(R.id.button_Left);
        buttonRight = (Button) findViewById(R.id.button_right);

        textView_story.setText("One morning the tortise woke up in a dream");
        textView_question.setText("Do you want to 'wake up' or 'explore' ?");

        buttonLeft.setText("wake up");
        buttonRight.setText("Explore");

        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.button_Left)
        {
            Intent i = new Intent (this, WakeUpActivity.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    }
}

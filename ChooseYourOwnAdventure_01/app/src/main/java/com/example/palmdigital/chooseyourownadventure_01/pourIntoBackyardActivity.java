package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pourIntoBackyardActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonLeft;
    Button buttonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pour_into_backyard);

        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        buttonLeft  = (Button) findViewById(R.id.button_Left);
        buttonRight = (Button) findViewById(R.id.button_right);

        textView_story.setText("As you walk into the backyard a net scoops you up and a giant" +
                " takes you to a boiling pot of water.");
        textView_question.setText("As the man starts to prepare you as soup, do you..." +
                "'Scream' or 'Faint'?");

        buttonLeft.setText("Scream");
        buttonRight.setText("Faint");

        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);
    }


    public void onClick(View view)
    {
        if (view.getId() == R.id.button_Left)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this, SoupActivity.class);
            startActivity(i);
        }
    }

}

package com.example.palmdigital.chooseyourownadventure_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pourIntoToiletActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonLeft;
    Button buttonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pour_into_toilet);

        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        buttonLeft  = (Button) findViewById(R.id.button_Left);
        buttonRight = (Button) findViewById(R.id.button_right);

        textView_story.setText( "As you pour the ooze into the toilet it backs up, " +
                "gurgles, and explodes, covering you in radioactive waste.");
        textView_question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");

        buttonLeft.setText("Yes");
        buttonRight.setText("HECK YES");

        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);

    }
    public void onClick(View view)
    {

    }

}

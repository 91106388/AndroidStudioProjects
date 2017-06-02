package org.palmdigital.madlib02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{

    String story;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                story = null;
            }
            else
            {
                story = extras.getString("STORY_SO_FAR1");
                story = extras.getString("STORY_SO_FAR2");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("STORY_SO_FAR1");
            story = (String) savedInstanceState.getSerializable("STORY_SO_FAR2");
        }



    }

    public void makeStory(View view)
    {
        TextView tv_story = (TextView)findViewById(R.id.text_view_story);
        tv_story.setText(story);
    }



}

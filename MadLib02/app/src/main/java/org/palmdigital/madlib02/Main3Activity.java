package org.palmdigital.madlib02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void next02(View view)
    {
        EditText et_adjective03 = (EditText) findViewById(R.id.edit_text_adjective03);
        EditText et_adjective04 = (EditText) findViewById(R.id.edit_text_adjective04);
        EditText et_plural_noun = (EditText) findViewById(R.id.edit_text_plural_noun);

        String str_adjective03 = et_adjective03.getText().toString();
        String str_adjective04 = et_adjective04.getText().toString();
        String str_plural_noun = et_plural_noun.getText().toString();

        String story = "Then you cover it with " + str_adjective03 + " sauce," + " "
                + str_adjective04 + " " + "cheese, and fresh chopped " + str_plural_noun;

        Intent i = new Intent(this, Main2Activity.class);

        i.putExtra("STORY_TO_FAR2", story);

        startActivity(i);
    }

}

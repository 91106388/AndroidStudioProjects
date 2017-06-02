package org.palmdigital.madlib02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view)
    {
        EditText et_adjective01 = (EditText) findViewById(R.id.edit_text_adjective01);
        EditText et_nation = (EditText) findViewById(R.id.edit_text_nation);
        EditText et_name = (EditText) findViewById(R.id.edit_text_name);
        EditText et_noun01 = (EditText) findViewById(R.id.edit_text_noun01);
        EditText et_adjective02 = (EditText) findViewById(R.id.edit_text_adjective02);
        EditText et_noun02 = (EditText) findViewById(R.id.edit_text_noun02);


        String str_adjective01 = et_adjective01.getText().toString();
        String str_nation = et_nation.getText().toString();
        String str_name = et_name.getText().toString();
        String str_noun01 = et_noun01.getText().toString();
        String str_adjective02 = et_adjective02.getText().toString();
        String str_noun02 = et_noun02.getText().toString();

        String story = "Pizza was invented by a " + str_adjective01 + " " + str_nation + " chef named"
                + " " + str_name + "." + "To make a pizza, you need to take a lump of " + str_noun01
                +  "," + "and a thin, round" + str_adjective02 + " " + str_noun02 + ".";

        Intent i = new Intent(this, Main3Activity.class);

        i.putExtra("STORY_SO_FAR1", story);

        startActivity(i);
    }

}

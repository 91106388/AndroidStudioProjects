package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        System.out.println("beginning of next01 method");
        /*
        // references
        EditText et_adj01 = (EditText) findViewById(R.id.edit_Text_adj01);
        EditText et_nationality = (EditText) findViewById(R.id.edit_text_nationality);
        EditText et_person = (EditText) findViewById(R.id.edit_text_person);

        String str_adj01 = et_adj01.getText().toString();
        String str_nationality = et_nationality.getText().toString();
        String str_person = et_person.getText().toString();

        String story = "Pizza was invented by a " + str_adj01 + str_nationality + " chef name "
                + str_person + ".";

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR1", story);

        startActivity(i);
        */
    }
}

package org.palmdigital.madlibsummer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeStory(View v)
    {
        EditText person = (EditText) findViewById(R.id.edit_Text_Person);
        EditText place = (EditText) findViewById(R.id.edit_Text_Place);
        EditText adjective = (EditText) findViewById(R.id.edit_Text_Adjective);
        EditText plural_noun = (EditText) findViewById(R.id.edit_Text_Plural_Noun);
        EditText adjective_2 = (EditText) findViewById(R.id.edit_Text_Adjective_2);
        EditText plural_noun_2 = (EditText) findViewById(R.id.edit_Text_Plural_Noun_2);
        EditText place_2 = (EditText) findViewById(R.id.edit_Text_Place_2);
        EditText action_verb = (EditText) findViewById(R.id.edit_Text_Action_Verb);
        EditText plural_noun_3 = (EditText) findViewById(R.id.edit_Text_plural_noun_3);

        TextView tv_story = (TextView) findViewById(R.id.text_View_Story);


        String story = "Last summer, my mom and dad took me and ";
        String str_person = person.getText().toString();
        String str_place = place.getText().toString();
        String str_adjective = adjective.getText().toString();
        String str_plural_noun = plural_noun.getText().toString();
        String str_adjective_2 = adjective_2.getText().toString();
        String str_plural_noun_2 = plural_noun_2.getText().toString();
        String str_place_2 = place_2.getText().toString();
        String str_action_verb = action_verb.getText().toString();
        String str_plural_noun_3 = plural_noun_3.getText().toString();

        story = story + str_person + " " + "on a trip to the "+ str_place +"."+ "The weather there is very "
         + str_adjective + "!" + "Northern " + str_place + " has many " + str_plural_noun + ","
        + "and they make " + str_adjective_2 + " "+ str_plural_noun_2 + " there" + "." +
        " Many people also go to " + str_place_2 + " to " + str_action_verb + " or see the "
                + str_plural_noun_3 + ".";


        tv_story.setText(story);

    }
}

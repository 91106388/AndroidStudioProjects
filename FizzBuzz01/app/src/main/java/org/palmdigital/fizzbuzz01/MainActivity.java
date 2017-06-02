package org.palmdigital.fizzbuzz01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view)
    {
        EditText eInput = (EditText)findViewById(R.id.input);
        TextView output = (TextView)findViewById(R.id.output);

        String strInput = eInput.getText().toString();

        int input = Integer.parseInt(strInput);



        if(input%5 == 0)
        {
            if(input%3 == 0)
            {
               output.setText("Fizz Buzz");
            }
            else
            {
                output.setText("Buzz");
            }
        }
        else if (input% 3 == 0)
        {
            output.setText("Fizz");
        }
        else
        {
            output.setText(strInput);
        }
    }
}

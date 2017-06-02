package com.example.palmdigital.buttonchallenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button) findViewById(R.id.button1);
        Button buttonObject2 = (Button) findViewById(R.id.button2);
        Button buttonObject3 = (Button) findViewById(R.id.button3);

        buttonObject1.setText("Contact");
        buttonObject2.setText("Email");
        buttonObject3.setText("Messages");

        buttonObject1.setBackgroundColor(0xff00ffff);
        buttonObject2.setBackgroundColor(0xff888888);
        buttonObject3.setBackgroundColor(0xffcccccc);

        buttonObject1.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);
    }

    public void onClick (View view)
    {
        if (view.getId() == R.id.button1)
        {
            Log.i("info", "You selected Contact!");
            Toast.makeText(this, "You selected Contact", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button2)
        {
            Log.i("info", "You selected Email!");
            Toast.makeText(this, "You selected Email", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.button3)
        {
            Log.i("info", "You selected Messages!");
            Toast.makeText(this, "You selected Messages", Toast.LENGTH_SHORT).show();
        }

    }
}

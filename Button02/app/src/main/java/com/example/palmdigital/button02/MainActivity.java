package com.example.palmdigital.button02;

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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        ButtonObject1.setOnClickListner(this);// this refers to this class
        //end of onCreate method
    }

    public void OnClick(View view)
    {
        Log.i("info", "you pressed Button 1!"

        Toast.makeText(MainActivity.this, "You pressed button1!", Toast.LENGTH_SHORT).show();
    }
}

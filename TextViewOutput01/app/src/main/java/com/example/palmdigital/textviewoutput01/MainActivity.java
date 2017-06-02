package com.example.palmdigital.textviewoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
     //fields
    ImageView imageViewNum1;
    ImageView imageViewNum2;
    ImageView imageViewNum3;
    ImageView imageViewNum4;
    ImageView imageViewNum5;
    ImageView imageViewNum6;
    ImageView imageViewPlus;


    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    int num1;
    int num2;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewEqual =(ImageView) findViewById(R.id.imageView_equal);

         textViewDisplayTop = (TextView) findViewById(R.id.textView_top);
         textViewDisplayMiddle = (TextView) findViewById(R.id.textView_middle);
         textViewDisplayBottom = (TextView) findViewById(R.id.textView_bottom);

        // setting the reference to be click listeners
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);



    }

    public void onClick(View view)
    {

        if(view.getId() == R.id.imageView1)
      {
            textViewDisplayTop.setText("1");
          num1 = 1;
      }
        else if(view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        else if(view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView_equal)
        {
           sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);
        }
    }

}

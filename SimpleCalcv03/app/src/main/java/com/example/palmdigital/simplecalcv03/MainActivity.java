package com.example.palmdigital.simplecalcv03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    int num1;
    int num2;
    int operator;

    TextView textView_top;

    ImageView imageViewNum_t0;
    ImageView imageViewNum_t1;
    ImageView imageViewNum_t2;
    ImageView imageViewNum_t3;
    ImageView imageViewNum_t4;
    ImageView imageViewNum_t5;
    ImageView imageViewNum_t6;
    ImageView imageViewNum_t7;
    ImageView imageViewNum_t8;
    ImageView imageViewNum_t9;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_top  = (TextView) findViewById(R.id.textView_top);

        imageViewNum_t0 = (ImageView) findViewById(R.id.imageView_t0);
        imageViewNum_t1 = (ImageView) findViewById(R.id.imageView_t1);
        imageViewNum_t2 = (ImageView) findViewById(R.id.imageView_t2);
        imageViewNum_t3 = (ImageView) findViewById(R.id.imageView_t3);
        imageViewNum_t4 = (ImageView) findViewById(R.id.imageView_t4);
        imageViewNum_t5 = (ImageView) findViewById(R.id.imageView_t5);
        imageViewNum_t6 = (ImageView) findViewById(R.id.imageView_t6);
        imageViewNum_t7 = (ImageView) findViewById(R.id.imageView_t7);
        imageViewNum_t8 = (ImageView) findViewById(R.id.imageView_t8);
        imageViewNum_t9 = (ImageView) findViewById(R.id.imageView_t9);

        imageViewNum_t0.setOnClickListener(this);
        imageViewNum_t1.setOnClickListener(this);
        imageViewNum_t2.setOnClickListener(this);
        imageViewNum_t3.setOnClickListener(this);
        imageViewNum_t4.setOnClickListener(this);
        imageViewNum_t5.setOnClickListener(this);
        imageViewNum_t6.setOnClickListener(this);
        imageViewNum_t7.setOnClickListener(this);
        imageViewNum_t8.setOnClickListener(this);
        imageViewNum_t9.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView_t0)
        {
            textView_top.setText("0");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView_t1)
        {
            textView_top.setText("1");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView_t3)
        {
            textView_top.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView_t4)
        {
            textView_top.setText("4");
            num1 = 4;
        }
    }
}

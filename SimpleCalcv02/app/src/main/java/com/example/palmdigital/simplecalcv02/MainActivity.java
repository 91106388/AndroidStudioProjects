package com.example.palmdigital.simplecalcv02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    int operator;

    ImageView imageViewNum0;
    ImageView imageViewNum1;
    ImageView imageViewNum2;
    ImageView imageViewNum3;
    ImageView imageViewNum4;
    ImageView imageViewNum5;
    ImageView imageViewNum6;
    ImageView imageViewNum7;
    ImageView imageViewNum8;
    ImageView imageViewNum9;

    ImageView imageViewNum_m0;
    ImageView imageViewNum_m1;
    ImageView imageViewNum_m2;
    ImageView imageViewNum_m3;
    ImageView imageViewNum_m4;
    ImageView imageViewNum_m5;
    ImageView imageViewNum_m6;
    ImageView imageViewNum_m7;
    ImageView imageViewNum_m8;
    ImageView imageViewNum_m9;

    ImageView imageView_plus;
    ImageView imageView_sub;

    int num1;
    int num2;
    int result;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_middle = (TextView) findViewById(R.id.textView_middle);
        textView_bottom = (TextView) findViewById(R.id.textView_bottom);



        imageViewNum0 = (ImageView) findViewById(R.id.imageView0);
        imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        imageViewNum9 = (ImageView) findViewById(R.id.imageView9);

        imageViewNum_m0 = (ImageView) findViewById(R.id.imageView_m0);
        imageViewNum_m1 = (ImageView) findViewById(R.id.imageView_m1);
        imageViewNum_m2 = (ImageView) findViewById(R.id.imageView_m2);
        imageViewNum_m3 = (ImageView) findViewById(R.id.imageView_m3);
        imageViewNum_m4 = (ImageView) findViewById(R.id.imageView_m4);
        imageViewNum_m5 = (ImageView) findViewById(R.id.imageView_m5);
        imageViewNum_m6 = (ImageView) findViewById(R.id.imageView_m6);
        imageViewNum_m7 = (ImageView) findViewById(R.id.imageView_m7);
        imageViewNum_m8 = (ImageView) findViewById(R.id.imageView_m8);
        imageViewNum_m9 = (ImageView) findViewById(R.id.imageView_m9);


        ImageView imageViewEqual = (ImageView) findViewById(R.id.imageView_equal);
        imageView_plus = (ImageView) findViewById(R.id.imageView_plus);
        imageView_sub = (ImageView) findViewById(R.id.imageView_sub);

        imageViewNum0.setOnClickListener(this);
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum7.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);

        imageViewNum_m0.setOnClickListener(this);
        imageViewNum_m1.setOnClickListener(this);
        imageViewNum_m2.setOnClickListener(this);
        imageViewNum_m3.setOnClickListener(this);
        imageViewNum_m4.setOnClickListener(this);
        imageViewNum_m5.setOnClickListener(this);
        imageViewNum_m6.setOnClickListener(this);
        imageViewNum_m7.setOnClickListener(this);
        imageViewNum_m8.setOnClickListener(this);
        imageViewNum_m9.setOnClickListener(this);

        imageViewEqual.setOnClickListener(this);
        imageView_plus.setOnClickListener(this);
        imageView_sub.setOnClickListener(this);



    }


    public void onClick(View view)
    {

        if(view.getId() == R.id.imageView0)
        {
            textView_top.setText("0");
            num1 = 0;
        }
        else if (view.getId() == R.id.imageView1)
        {
            textView_top.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView2)
        {
            textView_top.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textView_top.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textView_top.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textView_top.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textView_top.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textView_top.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textView_top.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.imageView9)
        {
            textView_top.setText("9");
            num1 = 9;
        }
        else if (view.getId() == R.id.imageView_m0)
        {
            textView_middle.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.imageView_m1)
        {
            textView_middle.setText("1");
            num2 = 1;
        }
        else if (view.getId() == R.id.imageView_m2)
        {
            textView_middle.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.imageView_m3)
        {
            textView_middle.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.imageView_m4)
        {
            textView_middle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView_m5)
        {
            textView_middle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView_m6)
        {
            textView_middle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView_m7)
        {
            textView_middle.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.imageView_m8)
        {
            textView_middle.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.imageView_m9)
        {
            textView_middle.setText("9");
            num2 = 9;
        }
        else if (view.getId() == R.id.imageView_plus)
        {
            operator = 0;
            switchBackground(0);
        }
        else if(view.getId() == R.id.imageView_sub)
        {
            operator = 1;
            switchBackground(1);
        }
        else if (view.getId() == R.id.imageView_equal)
        {
            if (operator == 0)
            {
                result = num1 + num2;
            }
            else if (operator == 1)
            {
                result = num1 - num2;
            }
            textView_bottom.setText("" + result);
        }

    }
    public void switchBackground(int operator)
    {
       if (operator == 0)
        {
            imageView_plus.setBackgroundColor(0xffff0000);
            imageView_sub.setBackgroundColor(0xffffffff);
        }
        else if (operator == 1)
        {
            imageView_plus.setBackgroundColor(0xffffffff);
            imageView_sub.setBackgroundColor(0xffff0000);
        }
    }

}



package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private TextView textView;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;

    int i;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    int k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i = 1;
                 button.setBackgroundColor(Color.YELLOW);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i2 = 0;
                button2.setBackgroundColor(Color.YELLOW);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i3 = 0;
                button3.setBackgroundColor(Color.YELLOW);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i4 = 0;
                button4.setBackgroundColor(Color.YELLOW);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i5 = 0;
                button5.setBackgroundColor(Color.YELLOW);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i6 = 1;
                button6.setBackgroundColor(Color.YELLOW);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i7 = 0;
                button7.setBackgroundColor(Color.YELLOW);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i8 = 0;
                button8.setBackgroundColor(Color.YELLOW);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i9 = 0;
                button9.setBackgroundColor(Color.YELLOW);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i10 = 0;
                button10.setBackgroundColor(Color.YELLOW);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i11 = 1;
                button11.setBackgroundColor(Color.YELLOW);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 i12 = 0;
                button12.setBackgroundColor(Color.YELLOW);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k = i+i2+i3+i4+i5+i6+i7+i8+i9+i10+i11+i12;
                textView5.setText("Your total Score is " + k);
                textView8.setText("Correct option : A");
                textView9.setText("Correct option : B");
                textView10.setText("Correct option : B");

            }
        });

    }
}
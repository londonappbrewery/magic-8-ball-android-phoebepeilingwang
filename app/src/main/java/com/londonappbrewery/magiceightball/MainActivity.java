package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.util.Log.d;
import static android.util.Log.isLoggable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay=(ImageView) findViewById(R.id.wordimage_eightBall);
        ImageView ballArray= (ImageView) findViewById(R.drawable.ball1);
        ballArray= (ImageView) findViewById(R.drawable.ball2);
        ballArray= (ImageView) findViewById(R.drawable.ball3);
        ballArray= (ImageView) findViewById(R.drawable.ball4);
        ballArray= (ImageView) findViewById(R.drawable.ball5);
        Button myButton= (Button) findViewById(R.id.askbutton);
        myButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator= new Random();
                int number=randomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(R.drawable.ball1);
                ballDisplay.setImageResource(R.drawable.ball2);
                ballDisplay.setImageResource(R.drawable.ball3);
                ballDisplay.setImageResource(R.drawable.ball4);
                ballDisplay.setImageResource(R.drawable.ball5);

            }
        });
    }
}

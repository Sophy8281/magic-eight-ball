package com.example.magiceightball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.ask_button);

        final ImageView magicBall = findViewById(R.id.image_eight_ball);

        final int[] imageArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(v -> {
            Random randomNumberGenerator = new Random();

            int number = randomNumberGenerator.nextInt(5);

            magicBall.setImageResource(imageArray[number]);
        });
    }
}
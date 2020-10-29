package com.example.app015countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCounter = findViewById(R.id.txt_counter);


        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long l) {

                txtCounter.setText("Left : " +l/1000 );

            }

            @Override
            public void onFinish() {
                txtCounter.setText("Done!");
            }
        }.start();

    }




}
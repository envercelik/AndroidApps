package com.example.app016stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Runnable runnable;
    Handler handler;
    TextView txtNumber;
    int number=0;
    Button btnStart;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = findViewById(R.id.txt_number);
        btnStart = findViewById(R.id.btn_start);
        btnStop = findViewById(R.id.btn_stop);
    }



    public void start(View view) {

        btnStart.setEnabled(false);

        handler = new Handler();

        runnable = new Runnable() {

            @Override
            public void run() {
                //işlemler
                number++;
                txtNumber.setText("" + number);

                handler.postDelayed(runnable,1000);
            }

        };

        handler.post(runnable);

    }


    public void stop(View view) {
        btnStart.setEnabled(true);
        handler.removeCallbacks(runnable); //arka planda çalışan runnable thread i kapattık
        number = 0;
        txtNumber.setText("" + number);
    }
}

/*

Runnable : Belirli bir periyodda belirli  işlemleri yapmak için kullanılır. Yaptığı işlemleri
           yeni bir thread de yapar.

           işlemler run methodu içerisine yazılır.


Handler : Runnable i yönetir.


*/
package com.example.app021activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Activity başlatıldı");

    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("Activity görünür duruma geçti");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity etkişime girilebilir duruma geçti");
    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity Etkileşime girilebilir durumdan çıktı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity görünür durumdan çıktı");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activiy yeniden başlatıldı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Acitivity sonlandırıldı");
    }
}
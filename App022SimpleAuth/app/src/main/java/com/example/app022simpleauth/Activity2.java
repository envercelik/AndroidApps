package com.example.app022simpleauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        initializes();

        Bundle intent = getIntent().getExtras();
        String userName = intent.getString("username");

        tv_welcome.setText("Welcome:" + userName);


    }

    public void initializes() {
        tv_welcome = findViewById(R.id.tv_welcome);
    }
}
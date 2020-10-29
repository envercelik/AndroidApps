package com.example.app017multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {

        int id = view.getId();
        Intent intent;

        switch (id) {

            case R.id.btn_calculator:
                intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_mass_index:
                intent = new Intent(MainActivity.this, MassIndexActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_age_calculation:
                intent = new Intent(MainActivity.this, AgeCalculatorActivity.class);
                startActivity(intent);
                break;


        }


    }
}
package com.example.app017multipleactivities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;
import java.util.Calendar;

public class AgeCalculatorActivity extends AppCompatActivity {

    EditText etBirthYear;
    TextView txtAge;
    Button btnComputeAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);

        initializes();

        btnComputeAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int birthYear = Integer.parseInt(etBirthYear.getText().toString());
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int age =  currentYear-birthYear;

                txtAge.setText("Your age : " + age);
            }
        });



    }


    public void initializes() {

        etBirthYear = findViewById(R.id.et_birth_year);
        txtAge = findViewById(R.id.txt_age);
        btnComputeAge = findViewById(R.id.btn_compute_age);


    }
}
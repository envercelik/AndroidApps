package com.example.app017multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassIndexActivity extends AppCompatActivity {

    EditText etHeight;
    EditText etWeight;
    TextView txtMassIndex;
    Button btnCalculateMassIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_index);

        initializes();


        btnCalculateMassIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double height = Double.parseDouble(etHeight.getText().toString());
                double weight = Double.parseDouble(etWeight.getText().toString());

                double massIndex = weight / Math.pow(height, 2);

                txtMassIndex.setText("Your mass index : " + massIndex);





            }
        });





    }


    public void initializes() {
        etHeight = findViewById(R.id.et_height);
        etWeight = findViewById(R.id.et_weight);
        txtMassIndex = findViewById(R.id.txt_mass_index);
        btnCalculateMassIndex = findViewById(R.id.btn_calculate_mass_index);

    }
}
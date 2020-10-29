package com.example.app017multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSum,btnSubtract,btnMultiply,btnDivision;
    EditText etNumber1,etNumber2;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        initializes();

        btnSum.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {

        int id = view.getId();
        double result = 0.0;

        String firstNumber = etNumber1.getText().toString();
        String secondNumber = etNumber2.getText().toString();





        if (!TextUtils.isEmpty(firstNumber) && !TextUtils.isEmpty(secondNumber)) {

            double number1 = Double.parseDouble(firstNumber);
            double number2 = Double.parseDouble(secondNumber);

            switch (id) {

                case R.id.btn_sum:
                    result = number1 + number2;
                    break;

                case R.id.btn_subtract:
                    result = number1 - number2;
                    break;

                case R.id.btn_multiply:
                    result = number1 * number2;
                    break;

                case R.id.btn_division:
                    if (number2 == 0)
                        Toast.makeText(getApplicationContext() , "Divided zero error" ,Toast.LENGTH_LONG).show();
                    else
                        result = number1 / number2;
            }

            tvResult.setText("Result : " + result);

        } else {

            Toast.makeText(getApplicationContext() ,"please enter two numbers" ,Toast.LENGTH_LONG).show();
        }





    }





    public void initializes() {
        btnSum = findViewById(R.id.btn_sum);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivision = findViewById(R.id.btn_division);

        etNumber1 = findViewById(R.id.et_number1);
        etNumber2 = findViewById(R.id.et_number2);

        tvResult = findViewById(R.id.tv_result);

    }
}
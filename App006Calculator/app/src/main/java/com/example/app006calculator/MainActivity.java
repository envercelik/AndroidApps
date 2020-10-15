package com.example.app006calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberText1;
    EditText numberText2;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText1 = findViewById(R.id.editTextNumber1);
        numberText2 = findViewById(R.id.editTextNumber2);
        resultText  = findViewById(R.id.textView);

    }


    public void sum (View view) {

        if (numberText1.getText().toString().matches("") || numberText2.getText().toString().matches("")) {
            resultText.setText("Please enter a number");
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            resultText.setText("Result : " + (number1 + number2));
        }

    }

    public void deduct (View view) {

        if (numberText1.getText().toString().matches("") || numberText2.getText().toString().matches("")) {
            resultText.setText("Please enter a number");
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            resultText.setText("Result : " + (number1 - number2));
        }

    }

    public void product (View view) {

        if (numberText1.getText().toString().matches("") || numberText2.getText().toString().matches("")) {
            resultText.setText("Please enter a number");
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            resultText.setText("Result : " + (number1 * number2));
        }

    }

    public void divide (View view) {

        if (numberText1.getText().toString().matches("") || numberText2.getText().toString().matches("")) {
            resultText.setText("Please enter a number");
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());


            if (number2 == 0) {
                resultText.setText("number 2 is not to be zero");
            } else {
                resultText.setText("Result : " + (number1 + number2));
            }


        }

    }


}
package com.example.app008viewelements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button calculateFactorial;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        calculateFactorial = findViewById(R.id.button4);
        calculateFactorial.setOnClickListener(this);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View view) {
        int number = Integer.parseInt(editText.getText().toString());
        int result = 1;

        while (number > 0) {
            result *= number;
            number--;
        }
        textView.setText("Result : " + result);

    }

    public void goToActivity3(View view){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}
package com.example.app008viewelements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener{

    CheckBox javaCb;
    CheckBox androidCb;
    CheckBox pythonCb;
    CheckBox djangoCb;

    RadioGroup radioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        javaCb = findViewById(R.id.javacb);
        androidCb = findViewById(R.id.androidcb);
        pythonCb = findViewById(R.id.pythoncb);
        djangoCb = findViewById(R.id.djangocb);


        javaCb.setOnClickListener(this);
        androidCb.setOnClickListener(this);
        pythonCb.setOnClickListener(this);
        djangoCb.setOnClickListener(this);


        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);


    }




    @Override
    public void onClick(View view) {

        CheckBox checkBox = (CheckBox) view;

        if (checkBox.isChecked()) {
            Toast.makeText(this,checkBox.getText() + " is checked" , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,checkBox.getText() + " removed" , Toast.LENGTH_SHORT).show();
        }

    }


    public void goToActivity6(View view) {
        Intent intent = new Intent(this , MainActivity6.class);
        startActivity(intent);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        if (i == R.id.man) {
            Toast.makeText(getApplicationContext(),"You are a man" ,Toast.LENGTH_SHORT).show();
        }

        if (i == R.id.woman) {
            Toast.makeText(getApplicationContext() ," You are a woman " , Toast.LENGTH_SHORT).show();
        }
    }
}
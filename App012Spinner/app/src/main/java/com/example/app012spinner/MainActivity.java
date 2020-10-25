package com.example.app012spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String[] cities = {"Istanbul" , "Ankara" , "Bursa" , "Eskisehir"};
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        spinner.setOnItemSelectedListener(this);




    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(getApplicationContext() ,spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    private void initialize() {
        spinner = findViewById(R.id.spinner);
        arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,cities);
        spinner.setAdapter(arrayAdapter);
    }


}
package com.example.app014storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAge;
    EditText etInputAge;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();



    }


    public void save(View view) {

        int age = Integer.parseInt(etInputAge.getText().toString());
        txtAge.setText("Your Age : " + age);

        sharedPreferences.edit().putInt("age",age).apply();

    }

    public void delete(View view) {

        int age = (sharedPreferences.getInt("age",0));

        if (age != 0) {
            sharedPreferences.edit().remove("age").apply();
            txtAge.setText("Your Age : ");
        }
    }

    public void initializes() {


        etInputAge = findViewById(R.id.et_age);
        sharedPreferences = this.getSharedPreferences("com.example.app014storingdata" , Context.MODE_PRIVATE);
        txtAge = findViewById(R.id.txt_age);
        txtAge.setText("Your Age : " + sharedPreferences.getInt("age",0));

    }


}


/*

Shared preferences :
 Telefon hafızasında küçük veriler saklamak için kullanılır. Örneğin kullanı adı.
 Veriler uygulama silinene kadar tutulur.


*/
package com.example.app014storingdata;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtAge;
    EditText etInputAge;
    SharedPreferences sharedPreferences;
    AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();

    }



    public void save(View view) {

        alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure?");

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                int age = Integer.parseInt(etInputAge.getText().toString());
                txtAge.setText("Your Age : " + age);
                sharedPreferences.edit().putInt("age",age).apply();
                Toast.makeText(MainActivity.this ,"Age saved" , Toast.LENGTH_SHORT).show();


            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this ,"not saved" , Toast.LENGTH_SHORT).show();
            }
        });

        alert.show();


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


Context :

Acticity Context : activity i ilgilendiren durumlarda  (ActivityName.this ile ulaşılır)
App Context      : uygulamanın genelini ilgilendiren durumlarda (getApplicationContext() ile ulaşılır)

*Activity adı vermeden sadece this dersek içinde bulunulşan activity işaret edilir.


*/
package com.example.app008viewelements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    ImageView imageView;
    Button changeImageButton;
    int imageNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        changeImageButton = findViewById(R.id.button6);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.hinata);

    }

    public void change(View view) {

        //int randomNumber = (int) (Math.random() * 4);

        imageNumber++;
        if (imageNumber == 5)
            imageNumber=1;

        if (imageNumber==1) {
            imageView.setImageResource(R.drawable.naruto);
        } else if (imageNumber == 2) {
            imageView.setImageResource(R.drawable.sasuke);
        } else if (imageNumber == 3) {
            imageView.setImageResource(R.drawable.sakura);
        } else if (imageNumber==4) {
            imageView.setImageResource(R.drawable.hinata);
        }

    }

    public void goToActivity4(View view) {
        Intent intent = new Intent(this , MainActivity4.class);
        startActivity(intent);
    }


}
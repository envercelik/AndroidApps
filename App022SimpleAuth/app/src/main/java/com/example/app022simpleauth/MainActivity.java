package com.example.app022simpleauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_username;
    EditText et_password;
    User user1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();
    }

    public void signIn(View view) {

        if(autValidation(user1)) {

            Intent intent = new Intent(this ,Activity2.class);
            intent.putExtra("username",user1.getUserName());
            startActivity(intent);
        } else  {
            Toast.makeText(getApplicationContext(),"username or password is incorrect" ,Toast.LENGTH_LONG).show();
        }



    }


    public boolean autValidation(User user) {

        String inputUserName = et_username.getText().toString();
        String inputPassword = et_password.getText().toString();

        if (user.getPassword().equals(inputPassword) && user.getUserName().equals(inputUserName)){

            return true;
        } else {
            return false;
        }

    }

    public void initializes() {
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

        user1 = new User("enver" ,"123456");
    }
}
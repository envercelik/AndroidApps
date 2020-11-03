package com.example.app024sendsmsormailormakecall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<User> userArrayList;
    LvContactAdapter lvContactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();

        createUserAndAddUserList("1","Enver Çelik","05515534154",R.drawable.naruto,"envercelik@gmail.com");
        createUserAndAddUserList("2","Fırat Çelik","05515534155",R.drawable.sasuke,"firatcelik@gmail.com");
        createUserAndAddUserList("3","Sebahat Çelik","05515534156",R.drawable.sakura,"sebahatcelik@gmail.com");
        createUserAndAddUserList("4","Defne Çelik","05515534157",R.drawable.hinata,"defnecelik@gmail.com");





    }


    public void initializes() {
        lvContact = findViewById(R.id.lv_contact);
        userArrayList = new ArrayList<>();
        lvContactAdapter = new LvContactAdapter(MainActivity.this,userArrayList,this);

        lvContact.setAdapter(lvContactAdapter);
    }



    public void createUserAndAddUserList(String id , String nameSurname , String phoneNumber , int photoId , String mailAddress) {

        User user = new User(id,nameSurname ,phoneNumber,photoId,mailAddress);
        userArrayList.add(user);

    }

}
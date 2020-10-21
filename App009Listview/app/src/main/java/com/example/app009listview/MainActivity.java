package com.example.app009listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> userList = new ArrayList<>();

        userList.add(new User(1,"enver1" ,"celiqenver1@gmail.com"));
        userList.add(new User(2,"enver2" ,"celiqenver2@gmail.com"));
        userList.add(new User(3,"enver3" ,"celiqenver3@gmail.com"));
        userList.add(new User(4,"enver4" ,"celiqenver4@gmail.com"));

        UserListAdapter adapter = new UserListAdapter(userList , this);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);






    }
}
package com.example.app010listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Message> messageList;
    ListView listView;
    MessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();

        addMessage();




    }


    public void initializes() {
        listView = findViewById(R.id.listView);
        messageList = new ArrayList<>();
        adapter = new MessageAdapter(this,messageList);
        listView.setAdapter(adapter);
    }


    public void addMessage() {

        User user = new User("Naruto",R.drawable.naruto);
        Message message = new Message("Hi Sakura" ,user);

        User user1 = new User("Sasuke",R.drawable.sasuke);
        Message message1 = new Message("Hi naruto" ,user1);

        messageList.add(message);
        messageList.add(message1);
    }

}
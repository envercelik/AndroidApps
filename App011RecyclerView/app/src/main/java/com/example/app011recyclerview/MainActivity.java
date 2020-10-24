package com.example.app011recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Message> messages;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();


    }

    public void initializes() {
        messages     = new ArrayList<>();
        addMessages();

        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        messageAdapter = new MessageAdapter(this,messages);
        recyclerView.setAdapter(messageAdapter);

    }


    public void addMessages() {

        User naruto = new User("Naruto",R.drawable.naruto);
        Message message1 = new Message(naruto,"Hello everyone");

        User sasuke = new User("Sasuke",R.drawable.sasuke);
        Message message2 = new Message(sasuke,"Hi");



        messages.add(message1);
        messages.add(message2);
    }

}
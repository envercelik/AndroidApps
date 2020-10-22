package com.example.app010listview2;

public class Message {

    private String content;
    private User user;

    public Message(String content, User user) {
        this.content = content;
        this.user = user;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

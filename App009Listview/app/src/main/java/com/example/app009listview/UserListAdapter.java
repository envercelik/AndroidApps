package com.example.app009listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Base64;
import java.util.List;

public class UserListAdapter extends BaseAdapter {

    List<User> userList;
    Context context;

    public UserListAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }


    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return userList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return userList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View userListView = LayoutInflater.from(context).inflate(R.layout.user_listview_item ,viewGroup,false);
        TextView id = userListView.findViewById(R.id.id);
        TextView name = userListView.findViewById(R.id.name);
        TextView email = userListView.findViewById(R.id.email);

        id.setText("id :" + userList.get(i).getId());
        name.setText("UserName : " + userList.get(i).getUsername());
        email.setText("Email : " + userList.get(i).getEmail());

        return userListView;
    }
}

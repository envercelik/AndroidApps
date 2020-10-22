package com.example.app010listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends BaseAdapter {

    Context context;
    List<Message> messages;

    public MessageAdapter(Context context, List<Message> messages) {
        this.context = context;
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View listViewMessageItem = LayoutInflater.from(context).inflate(R.layout.listview_message_item ,viewGroup,false);
        TextView nameText = listViewMessageItem.findViewById(R.id.textViewName);
        TextView contentText = listViewMessageItem.findViewById(R.id.textViewContent);
        ImageView imageView = listViewMessageItem.findViewById(R.id.imageView);

        nameText.setText(messages.get(i).getUser().getName());
        contentText.setText(messages.get(i).getContent());
        imageView.setImageResource(messages.get(i).getUser().getImageId());

        return listViewMessageItem;
    }
}

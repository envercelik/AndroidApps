package com.example.app011recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.Initialize> {

    Context context;
    List<Message> messageList;


    public MessageAdapter(Context context, List<Message> list) {
        this.context = context;
        this.messageList = list;
    }


    @NonNull
    @Override
    public Initialize onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View messageLayout = LayoutInflater.from(context).inflate(R.layout.recyclerview_message_item ,parent,false);

        return new Initialize(messageLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull Initialize holder, int position) {

        holder.imageView.setImageResource(messageList.get(position).getUser().getImageId());
        holder.messageText.setText(messageList.get(position).getContent());
        holder.nameText.setText(messageList.get(position).getUser().getName());


    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }



    public class Initialize extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView nameText;
        TextView messageText;


        public Initialize(@NonNull View itemView) {
            super(itemView);
            
            imageView = itemView.findViewById(R.id.imageView);
            nameText = itemView.findViewById(R.id.textViewName);
            messageText = itemView.findViewById(R.id.textViewContent);

            
        }
    }
}

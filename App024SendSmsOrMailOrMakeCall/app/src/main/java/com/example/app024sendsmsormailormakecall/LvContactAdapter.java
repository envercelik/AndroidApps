package com.example.app024sendsmsormailormakecall;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LvContactAdapter extends BaseAdapter{

    Context context;
    ArrayList<User> userArrayList;
    Activity activity;

    public LvContactAdapter(Context context, ArrayList<User> userArrayList, Activity activity) {
        this.context = context;
        this.userArrayList = userArrayList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return userArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return userArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View listViewContactItem = LayoutInflater.from(context).inflate(R.layout.lv_contact_item,viewGroup,false);
        ImageView ivUser = listViewContactItem.findViewById(R.id.iv_user);
        TextView tvNameSurname = listViewContactItem.findViewById(R.id.tv_name_surname);
        TextView tvPhoneNumber = listViewContactItem.findViewById(R.id.tv_phone_number);
        Button btnSms = listViewContactItem.findViewById(R.id.btn_sms);
        Button btnMail = listViewContactItem.findViewById(R.id.btn_mail);
        Button btnCall = listViewContactItem.findViewById(R.id.btn_call);

        ivUser.setImageResource(userArrayList.get(i).getPhotoId());
        tvNameSurname.setText(userArrayList.get(i).getNameSurname());
        tvPhoneNumber.setText(userArrayList.get(i).getPhoneNumber());

        final String telNo = userArrayList.get(i).getPhoneNumber();
        final String mailAddress = userArrayList.get(i).getMailAddress();


        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("sms:"+telNo));
                activity.startActivity(intent);

            }
        });


        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:"+telNo));
                activity.startActivity(intent);
            }
        });



        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {"user@gmail.com" ,mailAddress};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT , "Android app mail test");
                intent.putExtra(Intent.EXTRA_TEXT, "Content of mail");
                intent.setType("message/rfc822");
                Intent chooser = Intent.createChooser(intent , "sen a mail");
                activity.startActivity(intent);
            }
        });




        return listViewContactItem;
    }


}

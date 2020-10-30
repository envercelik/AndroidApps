package com.example.app018dynamiclinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        LinearLayout linearLayout = new LinearLayout(this);

        LinearLayout.LayoutParams matchParent =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT ,
                        LinearLayout.LayoutParams.MATCH_PARENT);


        LinearLayout.LayoutParams wrapContent =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT ,
                        LinearLayout.LayoutParams.WRAP_CONTENT);


        linearLayout.setLayoutParams(matchParent);
        linearLayout.setOrientation(LinearLayout.VERTICAL);


        TextView textView = new TextView(this);
        textView.setLayoutParams(wrapContent);
        textView.setText("Goodbye World");
        textView.setTextSize(24);




        Button button = new Button(this);
        button.setLayoutParams(wrapContent);
        button.setText("click");


        linearLayout.addView(textView);
        linearLayout.addView(button);


        setContentView(linearLayout);

        //setContentView(R.layout.activity_main);

    }
}

/*

-xml dosyları sadece veri tutan  ve veri alışverişine imkan tanıyan belgelerdir.

 Aslında  view lar -->  textview , imageview ,button , linearlayout... birer java classidir.




*/
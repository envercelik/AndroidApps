package com.example.app007intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button changeActivityButton;
    Button showOnTheMapButton;
    Button showOnTheMarketButton;
    Button sendMailButton;
    Button toastMessageButton;
    Button complexToastMessageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeActivityButton = findViewById(R.id.button);
        showOnTheMapButton = findViewById(R.id.button3);
        showOnTheMarketButton = findViewById(R.id.button4);
        sendMailButton = findViewById(R.id.button5);
        toastMessageButton = findViewById(R.id.button6);
        complexToastMessageButton = findViewById(R.id.button7);


        changeActivityButton.setOnClickListener(this);
        showOnTheMapButton.setOnClickListener(this);
        showOnTheMarketButton.setOnClickListener(this);
        sendMailButton.setOnClickListener(this);
        toastMessageButton.setOnClickListener(this);
        complexToastMessageButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if (view.getId() == changeActivityButton.getId() ) {
            //explicit intent
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
        }


        if (view.getId() == showOnTheMapButton.getId()) {
            //implicit intent
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:39.933363, 32.859742 "));
            Intent chooser = Intent.createChooser(intent , "Choose an application");
            startActivity(chooser);

        }


        if (view.getId() == showOnTheMarketButton.getId()) {
            //implicit intent
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.instagram.android"));
            startActivity(intent);

        }


        if (view.getId() == showOnTheMarketButton.getId()) {
            //implicit intent
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.instagram.android"));
            startActivity(intent);

        }



        if (view.getId() == sendMailButton.getId()) {
            //implicit intent
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"devcelikenver@gmail.com" ,"celiqenver@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT , "Android app mail test");
            intent.putExtra(Intent.EXTRA_TEXT, "Content of mail");
            intent.setType("message/rfc822");
            Intent chooser = Intent.createChooser(intent , "sen a mail");
            startActivity(intent);

        }


        if (view.getId() == toastMessageButton.getId()) {
            Toast.makeText(this,"This is a toast message" ,Toast.LENGTH_LONG).show();
        }



        if (view.getId() == complexToastMessageButton.getId()) {
            Toast toast = new Toast(this);
            LayoutInflater inflater = getLayoutInflater();
            View message = inflater.inflate(R.layout.toast_message ,(ViewGroup) findViewById(R.id.toastmessage));
            toast.setGravity(Gravity.CENTER , 0 ,0);
            toast.setView(message);
            toast.show();
        }




    }
}

/*

-Intent : Activity , Services , BroadcastReceiver arasında veri taşıyan sınıftır.




*Tüm Activiyler AndroidManifest dosyasında tanımlanır. Intent bu dosyadan hangi Activity i
 çağıracağını bulur.

*MainActivity sınıfına View.OnClickListener interfacesini implemente ettik. Yani MainActivity
 sınıfı artık bir dinleyici sınıf olma şartını sağlıyor dedik.
 MainActivity sınıfında bir öğeye tıklandığında onClick methodu tetiklenir ve tıklanan öğe
 View paramtresine atanır.

*this : MainActity sınıfını dinle

-LayoutInflater xml dosyalarını View nesnesine dönüştüren sınıftır.

*/
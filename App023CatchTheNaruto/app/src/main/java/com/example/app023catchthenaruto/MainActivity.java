package com.example.app023catchthenaruto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvTimer;
    TextView tvFinish;
    TextView tvScore;
    int score;

    ArrayList<ImageView> imageViews;

    Runnable runnable;
    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializes();
        setInvisible();
        countDownTimer(30000 ,1000);
        movement(500);
        

    }


    public void countDownTimer(int startTime , int period) {

        new CountDownTimer(startTime , period) {

            @Override
            public void onTick(long l) {
                tvTimer.setText("Time :" + l/1000);
                setVisible();
            }

            @Override
            public void onFinish() {
                tvFinish.setText("Times Up!");
                handler.removeCallbacks(runnable);
                setInvisible();
                restart();

            }
        }.start();

    }

    public void initializes() {

        tvTimer = findViewById(R.id.tv_timer);
        tvFinish = findViewById(R.id.tv_finish);
        tvScore = findViewById(R.id.tv_score);
        score = 0;
        imageViews = new ArrayList<>();


        //it looks so stupid... anyway

        imageViews.add(findViewById(R.id.imageView1));
        imageViews.add(findViewById(R.id.imageView2));
        imageViews.add(findViewById(R.id.imageView3));
        imageViews.add(findViewById(R.id.imageView4));
        imageViews.add(findViewById(R.id.imageView5));
        imageViews.add(findViewById(R.id.imageView6));
        imageViews.add(findViewById(R.id.imageView7));
        imageViews.add(findViewById(R.id.imageView8));
        imageViews.add(findViewById(R.id.imageView9));
        imageViews.add(findViewById(R.id.imageView10));
        imageViews.add(findViewById(R.id.imageView11));
        imageViews.add(findViewById(R.id.imageView12));
        imageViews.add(findViewById(R.id.imageView13));
        imageViews.add(findViewById(R.id.imageView14));
        imageViews.add(findViewById(R.id.imageView15));
        imageViews.add(findViewById(R.id.imageView16));
        imageViews.add(findViewById(R.id.imageView17));
        imageViews.add(findViewById(R.id.imageView18));
        imageViews.add(findViewById(R.id.imageView19));
        imageViews.add(findViewById(R.id.imageView20));
        imageViews.add(findViewById(R.id.imageView21));
        imageViews.add(findViewById(R.id.imageView22));
        imageViews.add(findViewById(R.id.imageView23));
        imageViews.add(findViewById(R.id.imageView24));
        imageViews.add(findViewById(R.id.imageView25));
        imageViews.add(findViewById(R.id.imageView26));
        imageViews.add(findViewById(R.id.imageView27));
        imageViews.add(findViewById(R.id.imageView28));
        imageViews.add(findViewById(R.id.imageView29));
        imageViews.add(findViewById(R.id.imageView30));


    }

    /**
     * set all image invisible
     */
    public void setInvisible() {

        for (ImageView imageView: imageViews) {
            imageView.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * set all image invisible and one image open
     */
    public void setVisible() {

        setInvisible();
        int randomNumber = (int) (Math.random() * 30);
        imageViews.get(randomNumber).setVisibility(View.VISIBLE);

    }

    public void increaseScore(View view) {
        score++;
        tvScore.setText("Score : " + score);
    }


    /**
     * periodically closing all images and opening one - in new thread  - using runnable
     */
    public void movement(int speed) {

        handler = new Handler();

        runnable = new Runnable() {

            @Override
            public void run() {

                //proses
                setInvisible();
                setVisible();


                handler.postDelayed(runnable,speed);
            }

        };

        handler.post(runnable);
    }


    /**
     * start again MainActivity using AlertDialog
     */
    public void restart() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

        alert.setTitle("Restart ?");
        alert.setMessage("Are you sure to restart game ?");

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });


        alert.show();


    }

}
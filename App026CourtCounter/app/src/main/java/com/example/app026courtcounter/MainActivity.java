package com.example.app026courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    TextView textViewScoreA;
    TextView textViewScoreB;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializes();
    }

    /*
    * Increase the score for team A or B.
    */
    public void increaseScore (View view) {

        switch (view.getId()) {

            case R.id.btn_three_point_team_a:
                scoreTeamA += 3;
                displayScoreForTeamA();
                break;


            case R.id.btn_two_point_team_a:
                scoreTeamA += 2;
                displayScoreForTeamA();
                break;


            case R.id.btn_one_point_team_a:
                scoreTeamA += 1;
                displayScoreForTeamA();
                break;

            case R.id.btn_three_point_team_b:
                scoreTeamB +=3;
                displayScoreForTeamB();
                break;

            case R.id.btn_two_point_team_b:
                scoreTeamB +=2;
                displayScoreForTeamB();
                break;

            case R.id.btn_one_point_team_b:
                scoreTeamB +=1;
                displayScoreForTeamB();
                break;

        }


    }

    public void initializes() {
        textViewScoreA = findViewById(R.id.text_view_score_team_a);
        textViewScoreB = findViewById(R.id.text_view_score_team_b);

    }


    public void displayScoreForTeamA() {
        textViewScoreA.setText(""+scoreTeamA);
    }

    public void displayScoreForTeamB() {
        textViewScoreB.setText(""+scoreTeamB);
    }


    /*
    * Resets the score for both teams back to zero.
    */
    public void resetScore(View view) {
        scoreTeamA = 0;
        displayScoreForTeamA();

        scoreTeamB = 0;
        displayScoreForTeamB();
    }

}
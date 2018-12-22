package com.example.tushar.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*methods for team A*/

    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



    /* methods for team B*/

    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}









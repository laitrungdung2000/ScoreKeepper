package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulingTeamA = 0;
    int foulingTeamB = 0;

    public void plusScoreTeamA(View view) {
        scoreTeamA++;
        displayScoreTeamA(scoreTeamA);
    }

    public void plusScoreTeamB(View view) {
        scoreTeamB++;
        displayScoreTeamB(scoreTeamB);
    }

    public void plusFoulingTeamA(View view) {
        foulingTeamA++;
        displayFoulingTeamA(foulingTeamA);
    }

    public void plusFoulingTeamB(View view) {
        foulingTeamB++;
        displayFoulingTeamB(foulingTeamB);
    }

    public void resetGame(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulingTeamA = 0;
        foulingTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulingTeamA(foulingTeamA);
        displayFoulingTeamB(foulingTeamB);
    }

    public void displayScoreTeamA(int score) {
        TextView scoreTeamA = (TextView) findViewById(R.id.score_team_A);
        scoreTeamA.setText("" + score);
    }

    public void displayScoreTeamB(int score) {
        TextView scoreTeamB = (TextView) findViewById(R.id.score_team_B);
        scoreTeamB.setText("" + score);
    }

    public void displayFoulingTeamA(int foul) {
        TextView foulingTeamA = (TextView) findViewById(R.id.fouling_team_A);
        foulingTeamA.setText("" + foul);
    }

    public void displayFoulingTeamB(int foul) {
        TextView foulingTeamB = (TextView) findViewById(R.id.fouling_team_B);
        foulingTeamB.setText("" + foul);
    }
}

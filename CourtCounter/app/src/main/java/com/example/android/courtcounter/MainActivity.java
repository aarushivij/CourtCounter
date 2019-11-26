package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

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

    public void Apointer2 (View view)
    {
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);

    }
    public void Apointer3 (View view)
    {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);

    }
    public void Afreethrow (View view)
    {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);

    }
    public void Bpointer2 (View view)
    {
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);

    }
    public void Bpointer3 (View view)
    {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    }
    public void Bfreethrow (View view)
    {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);

    }

    public void reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }





}

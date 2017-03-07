package com.example.android.courtcounter;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.PlayerFive_a_score;
import static com.example.android.courtcounter.R.id.PlayerFive_b_score;
import static com.example.android.courtcounter.R.id.PlayerFour_a_score;
import static com.example.android.courtcounter.R.id.PlayerFour_b_score;
import static com.example.android.courtcounter.R.id.PlayerOne_a_score;
import static com.example.android.courtcounter.R.id.PlayerOne_b_score;
import static com.example.android.courtcounter.R.id.PlayerThree_a_score;
import static com.example.android.courtcounter.R.id.PlayerThree_b_score;
import static com.example.android.courtcounter.R.id.PlayerTwo_a_score;
import static com.example.android.courtcounter.R.id.PlayerTwo_b_score;
import static com.example.android.courtcounter.R.id.team_a_score;


public class MainActivity extends AppCompatActivity {


    static final String STATE_SCOREA = "scoreTeamA";
    static final String STATE_SCOREAP1 = "scorePlayerOneTeamA";
    static final String STATE_SCOREAP2 = "scorePlayerTwoTeamA";
    static final String STATE_SCOREAP3 = "scorePlayerThreeTeamA";
    static final String STATE_SCOREAP4 = "scorePlayerFourTeamA";
    static final String STATE_SCOREAP5 = "scorePlayerFiveTeamA";

    static final String STATE_SCOREB = "scoreTeamB";
    static final String STATE_SCOREBP1 = "scorePlayerOneTeamB";
    static final String STATE_SCOREBP2 = "scorePlayerTwoTeamB";
    static final String STATE_SCOREBP3 = "scorePlayerThreeTeamB";
    static final String STATE_SCOREBP4 = "scorePlayerFourTeamB";
    static final String STATE_SCOREBP5 = "scorePlayerFiveTeamB";

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scorePlayerOneTeamA = 0;
    int scorePlayerTwoTeamA = 0;
    int scorePlayerThreeTeamA = 0;
    int scorePlayerFourTeamA = 0;
    int scorePlayerFiveTeamA = 0;
    int scorePlayerOneTeamB = 0;
    int scorePlayerTwoTeamB = 0;
    int scorePlayerThreeTeamB = 0;
    int scorePlayerFourTeamB = 0;
    int scorePlayerFiveTeamB = 0;


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // let save scoreTeamA data using the unique key i created above.
        savedInstanceState.putInt(STATE_SCOREA, scoreTeamA);
        // Always call the superclass so it can save the view hierarchy state
        savedInstanceState.putInt(STATE_SCOREAP1, scorePlayerOneTeamA);
        savedInstanceState.putInt(STATE_SCOREAP2, scorePlayerTwoTeamA);
        savedInstanceState.putInt(STATE_SCOREAP3, scorePlayerThreeTeamA);
        savedInstanceState.putInt(STATE_SCOREAP4, scorePlayerFourTeamA);
        savedInstanceState.putInt(STATE_SCOREAP5, scorePlayerFiveTeamA);

        savedInstanceState.putInt(STATE_SCOREB, scoreTeamB);

        savedInstanceState.putInt(STATE_SCOREBP1, scorePlayerOneTeamB);
        savedInstanceState.putInt(STATE_SCOREBP2, scorePlayerTwoTeamB);
        savedInstanceState.putInt(STATE_SCOREBP3, scorePlayerThreeTeamB);
        savedInstanceState.putInt(STATE_SCOREBP4, scorePlayerFourTeamB);
        savedInstanceState.putInt(STATE_SCOREBP5, scorePlayerFiveTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);


// Restore state members from saved instance
// Restore the data you saved using the key you used to store it with.
// put that in scoreTeamA variable.
        scoreTeamA = savedInstanceState.getInt(STATE_SCOREA);
        scoreTeamB = savedInstanceState.getInt(STATE_SCOREB);
// dont forget to redisplay the score here.

        scorePlayerOneTeamA = savedInstanceState.getInt(STATE_SCOREAP1);
        scorePlayerTwoTeamA = savedInstanceState.getInt(STATE_SCOREAP2);
        scorePlayerThreeTeamA = savedInstanceState.getInt(STATE_SCOREAP3);
        scorePlayerFourTeamA = savedInstanceState.getInt(STATE_SCOREAP4);
        scorePlayerFiveTeamA = savedInstanceState.getInt(STATE_SCOREAP5);

        scorePlayerOneTeamB = savedInstanceState.getInt(STATE_SCOREBP1);
        scorePlayerTwoTeamB = savedInstanceState.getInt(STATE_SCOREBP2);
        scorePlayerThreeTeamB = savedInstanceState.getInt(STATE_SCOREBP3);
        scorePlayerFourTeamB = savedInstanceState.getInt(STATE_SCOREBP4);
        scorePlayerFiveTeamB = savedInstanceState.getInt(STATE_SCOREBP5);


        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);


        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);

        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);

        super.onRestoreInstanceState(savedInstanceState);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.activity_main_landscape);
        }


        displayForTeamA(0);
        displayForTeamB(0);
        displayForPlayerOneForTeamA(0);
        displayForPlayerTwoForTeamA(0);
        displayForPlayerThreeForTeamA(0);
        displayForPlayerFourForTeamA(0);
        displayForPlayerFiveForTeamA(0);
        displayForPlayerOneForTeamB(0);
        displayForPlayerTwoForTeamB(0);
        displayForPlayerThreeForTeamB(0);
        displayForPlayerFourForTeamB(0);
        displayForPlayerFiveForTeamB(0);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerOne Team A.
     */
    public void displayForPlayerOneForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerOne_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerTwo Team A.
     */
    public void displayForPlayerTwoForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerTwo_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerThree Team A.
     */
    public void displayForPlayerThreeForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerThree_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFour Team A.
     */
    public void displayForPlayerFourForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFour_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFive Team A.
     */
    public void displayForPlayerFiveForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFive_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for PlayerOne Team B.
     */
    public void displayForPlayerOneForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerOne_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerTwo Team B.
     */
    public void displayForPlayerTwoForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerTwo_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerThree Team B.
     */
    public void displayForPlayerThreeForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerThree_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFour Team B.
     */
    public void displayForPlayerFourForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFour_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerFive Team B.
     */
    public void displayForPlayerFiveForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(PlayerFive_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset both teams scores back to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scorePlayerOneTeamA = 0;
        scorePlayerTwoTeamA = 0;
        scorePlayerThreeTeamA = 0;
        scorePlayerFourTeamA = 0;
        scorePlayerFiveTeamA = 0;
        scorePlayerOneTeamB = 0;
        scorePlayerTwoTeamB = 0;
        scorePlayerThreeTeamB = 0;
        scorePlayerFourTeamB = 0;
        scorePlayerFiveTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
    }


    /**
     * Increases score for PlayerOneTeam A by 3 points.
     */

    public void addThreeForPlayerOneTeamA(View v) {
        scorePlayerOneTeamA = scorePlayerOneTeamA + 3;
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerOneTeam A by 2 points.
     */

    public void addTwoForPlayerOneTeamA(View v) {
        scorePlayerOneTeamA = scorePlayerOneTeamA + 2;
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerOneTeam A by 1 point.
     */

    public void addOneForPlayerOneTeamA(View v) {
        scorePlayerOneTeamA = scorePlayerOneTeamA + 1;
        displayForPlayerOneForTeamA(scorePlayerOneTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerTwoTeam A by 3 points.
     */

    public void addThreeForPlayerTwoTeamA(View v) {
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + 3;
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerTwoTeam A by 2 points.
     */

    public void addTwoForPlayerTwoTeamA(View v) {
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + 2;
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerTwoTeam A by 1 point.
     */

    public void addOneForPlayerTwoTeamA(View v) {
        scorePlayerTwoTeamA = scorePlayerTwoTeamA + 1;
        displayForPlayerTwoForTeamA(scorePlayerTwoTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }


    /**
     * Increases score for PlayerThreeTeam A by 3 points.
     */

    public void addThreeForPlayerThreeTeamA(View v) {
        scorePlayerThreeTeamA = scorePlayerThreeTeamA + 3;
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerThreeTeam A by 2 points.
     */

    public void addTwoForPlayerThreeTeamA(View v) {
        scorePlayerThreeTeamA = scorePlayerThreeTeamA + 2;
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerThreeTeam A by 1 point.
     */

    public void addOneForPlayerThreeTeamA(View v) {
        scorePlayerThreeTeamA = scorePlayerThreeTeamA + 1;
        displayForPlayerThreeForTeamA(scorePlayerThreeTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }


    /**
     * Increases score for PlayerFourTeam A by 3 points.
     */

    public void addThreeForPlayerFourTeamA(View v) {
        scorePlayerFourTeamA = scorePlayerFourTeamA + 3;
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFourTeam A by 2 points.
     */

    public void addTwoForPlayerFourTeamA(View v) {
        scorePlayerFourTeamA = scorePlayerFourTeamA + 2;
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFourTeam A by 1 point.
     */

    public void addOneForPlayerFourTeamA(View v) {
        scorePlayerFourTeamA = scorePlayerFourTeamA + 1;
        displayForPlayerFourForTeamA(scorePlayerFourTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFiveTeam A by 3 points.
     */

    public void addThreeForPlayerFiveTeamA(View v) {
        scorePlayerFiveTeamA = scorePlayerFiveTeamA + 3;
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFiveTeam A by 2 points.
     */

    public void addTwoForPlayerFiveTeamA(View v) {
        scorePlayerFiveTeamA = scorePlayerFiveTeamA + 2;
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerFiveTeam A by 1 point.
     */

    public void addOneForPlayerFiveTeamA(View v) {
        scorePlayerFiveTeamA = scorePlayerFiveTeamA + 1;
        displayForPlayerFiveForTeamA(scorePlayerFiveTeamA);
        displayForTeamA(scorePlayerOneTeamA + scorePlayerTwoTeamA + scorePlayerThreeTeamA + scorePlayerFourTeamA + scorePlayerFiveTeamA);
    }

    /**
     * Increases score for PlayerOneTeam B by 3 points.
     */

    public void addThreeForPlayerOneTeamB(View v) {
        scorePlayerOneTeamB = scorePlayerOneTeamB + 3;
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerOneTeam B by 2 points.
     */

    public void addTwoForPlayerOneTeamB(View v) {
        scorePlayerOneTeamB = scorePlayerOneTeamB + 2;
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerOneTeam B by 1 point.
     */

    public void addOneForPlayerOneTeamB(View v) {
        scorePlayerOneTeamB = scorePlayerOneTeamB + 1;
        displayForPlayerOneForTeamB(scorePlayerOneTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerTwoTeam B by 3 points.
     */

    public void addThreeForPlayerTwoTeamB(View v) {
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + 3;
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerTwoTeam B by 2 points.
     */

    public void addTwoForPlayerTwoTeamB(View v) {
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + 2;
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerTwoTeam B by 1 point.
     */

    public void addOneForPlayerTwoTeamB(View v) {
        scorePlayerTwoTeamB = scorePlayerTwoTeamB + 1;
        displayForPlayerTwoForTeamB(scorePlayerTwoTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }


    /**
     * Increases score for PlayerThreeTeam B by 3 points.
     */

    public void addThreeForPlayerThreeTeamB(View v) {
        scorePlayerThreeTeamB = scorePlayerThreeTeamB + 3;
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerThreeTeam B by 2 points.
     */

    public void addTwoForPlayerThreeTeamB(View v) {
        scorePlayerThreeTeamB = scorePlayerThreeTeamB + 2;
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerThreeTeam B by 1 point.
     */

    public void addOneForPlayerThreeTeamB(View v) {
        scorePlayerThreeTeamB = scorePlayerThreeTeamB + 1;
        displayForPlayerThreeForTeamB(scorePlayerThreeTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }


    /**
     * Increases score for PlayerFourTeam B by 3 points.
     */

    public void addThreeForPlayerFourTeamB(View v) {
        scorePlayerFourTeamB = scorePlayerFourTeamB + 3;
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFourTeam B by 2 points.
     */

    public void addTwoForPlayerFourTeamB(View v) {
        scorePlayerFourTeamB = scorePlayerFourTeamB + 2;
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFourTeam B by 1 point.
     */

    public void addOneForPlayerFourTeamB(View v) {
        scorePlayerFourTeamB = scorePlayerFourTeamB + 1;
        displayForPlayerFourForTeamB(scorePlayerFourTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFiveTeam B by 3 points.
     */

    public void addThreeForPlayerFiveTeamB(View v) {
        scorePlayerFiveTeamB = scorePlayerFiveTeamB + 3;
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFiveTeam B by 2 points.
     */

    public void addTwoForPlayerFiveTeamB(View v) {
        scorePlayerFiveTeamB = scorePlayerFiveTeamB + 2;
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }

    /**
     * Increases score for PlayerFiveTeam B by 1 point.
     */

    public void addOneForPlayerFiveTeamB(View v) {
        scorePlayerFiveTeamB = scorePlayerFiveTeamB + 1;
        displayForPlayerFiveForTeamB(scorePlayerFiveTeamB);
        displayForTeamB(scorePlayerOneTeamB + scorePlayerTwoTeamB + scorePlayerThreeTeamB + scorePlayerFourTeamB + scorePlayerFiveTeamB);
    }
}

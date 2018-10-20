package com.myapp.winchester.myapplication;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighestScoreIloco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score_iloco);
        TextView mGrade = (TextView) findViewById(R.id.grade);
        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("Your score: " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
        if (score == 10 || score == 9){
            mGrade.setText("Outstanding");
        }else if (score <= 8 && score >= 6){
            mGrade.setText("Good Work");
        }else if (score == 5) {
            mGrade.setText("Good Effort");
        }else {
            mGrade.setText("Do better next time!");
        }
    }


    public void onRepeatClick(View view) {
        Intent intent = new Intent(HighestScoreIloco.this, MainActivity.class);
        startActivity(intent);
    }
}


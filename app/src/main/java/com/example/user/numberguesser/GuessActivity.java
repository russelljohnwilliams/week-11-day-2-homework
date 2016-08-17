package com.example.user.numberguesser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class GuessActivity extends AppCompatActivity {

    TextView mGuessText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        mGuessText = (TextView) findViewById(R.id.guess_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String question = extras.getString("question");
        String answer = extras.getString("answer");

        if (new String(question).equals(answer)){
            mGuessText.setText("What what what,\nthis cannot be!\nyou guessed your guess the same as me\nWe both thought " + answer);
        }
        else {
            mGuessText.setText("\nYou silly sod,\nthat wasn't right, I'm afraid the answer was clearly: \n" + answer);
        };
    }
}

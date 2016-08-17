package com.example.user.numberguesser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collections;

public class NumberGuesser extends AppCompatActivity {

    EditText mQuestionEditText;
    //    TextView mAnswerText;
    Button mGuessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mQuestionEditText = (EditText)findViewById(R.id.question_text);
//        mAnswerText = (TextView)findViewById(R.id.answer_text);
        mGuessButton = (Button)findViewById(R.id.guess_button);

        final ArrayList<String> answers = new ArrayList();
        answers.add("1");
        answers.add("2");
        answers.add("3");
        answers.add("4");
        answers.add("5");

        mGuessButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String question = mQuestionEditText.getText().toString();
                Collections.shuffle(answers);
                String answer = answers.get(0);

                Intent intent = new Intent(NumberGuesser.this, GuessActivity.class);
                intent.putExtra("question", question);
                intent.putExtra("answer", answer);


                startActivity(intent);
            }
        });



    }
}





//package com.example.user.numberguesser;
//
//        import android.content.Intent;
//        import android.support.v7.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.util.Log;
//        import android.view.View;
//        import android.widget.Button;
//        import android.widget.EditText;
//        import java.util.ArrayList;
//        import java.util.Collections;
//
//public class NumberGuesser extends AppCompatActivity {
//
//    EditText mQuestionEditText;
//    //    TextView mAnswerText;
//    Button mGuessButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//
//        mQuestionEditText = (EditText)findViewById(R.id.question_text);
////        mAnswerText = (TextView)findViewById(R.id.answer_text);
//        mGuessButton = (Button)findViewById(R.id.guess_button);
//
//        final ArrayList<Integer> answers = new ArrayList();
//        answers.add(1);
//        answers.add(2);
//        answers.add(3);
//
//        mGuessButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String result = mQuestionEditText.getText().toString();
//                int question = Integer.parseInt(result);
//                Collections.shuffle(answers);
//                int answer = answers.get(0);
//
//                Intent intent = new Intent(NumberGuesser.this, GuessActivity.class);
//                intent.putExtra("question", question);
//                intent.putExtra("answer", answer);
//
//
//                startActivity(intent);
//            }
//        });
//
//
//
//    }
//}

package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView outputTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        outputTextview = findViewById(R.id.outputTextViewId);
        Intent myoutputIntent = getIntent();
        int outmarks = myoutputIntent.getIntExtra(MainActivity.markExtraData,0);
        if (outmarks == 5) {
            outputTextview.setText("Your answer is correct and your marks is 5");
        }else{
            outputTextview.setText("Your answer is wrong and your marks is 0");
        }
    }

    public void outputFunction(View view) {
    }

    public void tryFunction(View view) {
    }
}
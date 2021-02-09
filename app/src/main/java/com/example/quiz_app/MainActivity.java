package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
RadioGroup myRadioGroup;
RadioButton myRadioButton;
int mark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRadioGroup = findViewById(R.id.radioGroupId);
    }

    public void submitFunction(View view) {
        int selectedRadioButtonId = myRadioGroup.getCheckedRadioButtonId();
        myRadioButton = findViewById(selectedRadioButtonId);
        if(myRadioButton.getText().toString().equals("Dhaka")){
         mark=5;
        }
    }
}
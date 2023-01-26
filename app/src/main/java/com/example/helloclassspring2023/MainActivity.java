package com.example.helloclassspring2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_click(View v)
    {
        TextView msg = findViewById(R.id.message);
        counter += 1;
        if (counter == 1)
            msg.setText(" Welcome to the class of Mobile Computing, " +
                "You have clicked the button " + counter +" time");
        else
            msg.setText(" Welcome to the class of Mobile Computing, " +
                    "You have clicked the button " + counter +" times");
    }
}
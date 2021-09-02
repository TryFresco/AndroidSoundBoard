package com.example.soundboard3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Button buttonOne = findViewById(R.id.button);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void start(View view) {
        Intent startNewActivity = new Intent(this, MainActivity2.class);
        startActivity(startNewActivity);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }


}
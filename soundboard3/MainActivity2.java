package com.example.soundboard3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import static com.example.soundboard3.R.layout.activity_main2;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void playSound(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.sheeesh);
        mediaPlayer.start();
    }

    public void returnPage(View view) {
        Intent startNewActivity = new Intent(this, MainActivity.class);
        startActivity(startNewActivity);
    }

    public void nCock(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.nc);
        mediaPlayer.start();
    }
}
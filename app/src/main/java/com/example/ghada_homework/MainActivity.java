package com.example.ghada_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    MediaPlayer song;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        song = new MediaPlayer();
        song = MediaPlayer.create(this, R.raw.track1);

        playing = 0;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing==0){
                    playing++;
                    song.start();
                }
                else if(playing==1){
                    playing--;
                    song.stop();
                }
            }
        });


        Button go22 = (Button) findViewById(R.id.button2);
        go22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}
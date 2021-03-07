package com.example.ghada_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button show = (Button) findViewById(R.id.button5);

        show.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.textView4));
            @Override
            public void onClick(View v) {

                result.setText("Hi " +R.id.editTextTextPersonName + " You are "+R.id.editTextNumber +" years old ");

            }
        });


        Button go23 = (Button) findViewById(R.id.button3);
        go23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });
    }
}
package com.example.ghada_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button show = (Button) findViewById(R.id.button5);
        final EditText name = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText year = (EditText) findViewById(R.id.editTextNumber);
        final TextView result = ((TextView)findViewById(R.id.textView4));
        RadioButton male = (RadioButton) findViewById(R.id.radioButton);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = 2021 - Integer.parseInt(year.getText().toString());

                if(male.isChecked()){
                    result.setText("Hi Mr " + name.getText() + " You are "+ age +" years old ");
                }
                else {
                    result.setText("Hi Ms " + name.getText() + " You are " + age + " years old ");
                }

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
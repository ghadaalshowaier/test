package com.example.ghada_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String[] items = {"picture", "website",};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView6, items));

        Button go21 = (Button) findViewById(R.id.button4);
        go21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            }
        });
    }

    private void setListAdapter(ArrayAdapter<String> stringArrayAdapter) {
    }

    protected void onListItemClick(ListView lv, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity3.this, picture.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alfaisal.edu")));
                break;

        }
    }
}
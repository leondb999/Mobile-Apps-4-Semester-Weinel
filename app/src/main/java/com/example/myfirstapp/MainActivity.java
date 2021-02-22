package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView);
        Button lesenBtn = (Button) findViewById(R.id.lesenBtn);
        lesenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ReadDatabase(textView).execute("someParams");
            }
        });
    }


}
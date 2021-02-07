package com.example.heator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton toMonitor = findViewById(R.id.toMonitor);
        toMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monitor = new Intent(MainActivity.this, Monitor.class);
                startActivity(monitor);
            }
        });

        TextView currentTmp = findViewById(R.id.currentTemp);
        TextView timeLeft = findViewById(R.id.timeLeft);

    }

}
package com.example.heator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Monitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        ImageButton toDashboard = findViewById(R.id.toDashboard);
        toDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboard = new Intent(Monitor.this, MainActivity.class);
                startActivity(dashboard);
            }
        });

        EditText minTmp = findViewById(R.id.minimumTemp);

    }

}

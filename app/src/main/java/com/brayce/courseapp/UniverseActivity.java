package com.brayce.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UniverseActivity extends AppCompatActivity {

    Button btnUniverse;
    Intent mainActIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universe);

        btnUniverse = findViewById(R.id.button_universe);

        btnUniverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActIntent = new Intent(UniverseActivity.this, MainActivity.class);
                startActivity(mainActIntent);
            }
        });
    }
}

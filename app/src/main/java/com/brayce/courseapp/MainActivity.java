package com.brayce.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWorld;
    Intent universeIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWorld = (Button) findViewById(R.id.btn_world);

        btnWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                universeIntent = new Intent(MainActivity.this, UniverseActivity.class);
                startActivity(universeIntent);
            }
        });
    }

    public void moveToUniverse(View view){
        universeIntent = new Intent(MainActivity.this, UniverseActivity.class);
        startActivity(universeIntent);
    }
}

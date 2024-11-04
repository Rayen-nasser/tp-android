package com.example.tpperson;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartedButton = findViewById(R.id.get_started_button);

        getStartedButton.setOnClickListener(v -> {
            // Log message
            Log.d("MainActivity", "Get Started button clicked");
            Intent intent = new Intent(MainActivity.this, PersonListActivity.class);
            startActivity(intent);
        });

    }
}

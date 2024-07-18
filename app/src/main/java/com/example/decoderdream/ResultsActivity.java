package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        // Find the back button
        Button backButton = findViewById(R.id.button2);

        // Set click listener for back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to DreamInterpretationActivity
                Intent intent = new Intent(ResultsActivity.this, DreamInterpretationActivity.class);
                startActivity(intent);
                finish(); // Finish current activity
            }
        });
    }
}


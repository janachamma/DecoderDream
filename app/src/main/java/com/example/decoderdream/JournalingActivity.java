package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JournalingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_pattern_tracking);

        // Initialize EditText fields
        EditText etDreamDescription = findViewById(R.id.etDreamDescription);
        EditText etDreamDate = findViewById(R.id.etDreamDate);
        EditText etDreamEmotions = findViewById(R.id.etDreamEmotions);
        EditText etDreamSymbols = findViewById(R.id.etDreamSymbols);

        // Find the "Save Dream" button
        Button btnSaveDream = findViewById(R.id.btnSaveDream);
        // Find the "Back" button
        Button btnBack = findViewById(R.id.btnBack);

        // Set click listener for "Save Dream" button
        btnSaveDream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle saving dream logic here

                // Navigate to DreamsHistoryActivity
                Intent intent = new Intent(JournalingActivity.this, DreamHistoryActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for "Back" button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to HomePageActivity (assuming this is the name of the homepage activity)
                Intent intent = new Intent(JournalingActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}

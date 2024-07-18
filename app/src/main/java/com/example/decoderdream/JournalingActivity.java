package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JournalingActivity extends AppCompatActivity {

    private EditText etDreamDescription, etDreamDate, etDreamEmotions, etDreamSymbols;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_pattern_tracking);

        // Initialize EditText fields
        etDreamDescription = findViewById(R.id.etDreamDescription);
        etDreamDate = findViewById(R.id.etDreamDate);
        etDreamEmotions = findViewById(R.id.etDreamEmotions);
        etDreamSymbols = findViewById(R.id.etDreamSymbols);

        // Find the "Save Dream" button
        Button btnSaveDream = findViewById(R.id.btnSaveDream);

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
    }
}

package com.example.decoderdream;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DreamHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        // Find the "Back" button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button backButton = findViewById(R.id.button);

        // Set click listener for "Back" button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to JournalingActivity
                navigateToJournalingActivity();
            }
        });
    }

    private void navigateToJournalingActivity() {
        // Create an intent to navigate to JournalingActivity
        Intent intent = new Intent(DreamHistoryActivity.this, JournalingActivity.class);
        startActivity(intent);
        finish(); // Finish current activity (ResultsActivity)
    }
}


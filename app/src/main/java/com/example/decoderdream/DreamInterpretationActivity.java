package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DreamInterpretationActivity extends AppCompatActivity {

    private EditText dreamInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreaminterpretation);

        // Initialize the views
        dreamInput = findViewById(R.id.dream_input);
        Button analyzeButton = findViewById(R.id.analyze_button);
        Button backButton = findViewById(R.id.back_button);

        // Set a click listener on the analyze button
        analyzeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the dream text input
                String dreamText = dreamInput.getText().toString().trim();

                // Check if the input is empty
                if (dreamText.isEmpty()) {
                    // Display a toast message if the input is empty
                    Toast.makeText(DreamInterpretationActivity.this, "Please enter a dream to analyze", Toast.LENGTH_SHORT).show();
                } else {
                    // Start the results activity and pass the dream text as an extra
                    Intent intent = new Intent(DreamInterpretationActivity.this, ResultsActivity.class);
                    intent.putExtra("dream_text", dreamText);
                    startActivity(intent);
                }
            }
        });

        // Set a click listener on the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the homepage
                Intent intent = new Intent(DreamInterpretationActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}



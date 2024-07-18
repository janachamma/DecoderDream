package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team); // Make sure the layout file name matches

        // Set up the back button
        Button backButton = findViewById(R.id.backButton); // Assuming you add a button with this ID
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToOptionsPage();
            }
        });
    }

    // Method to navigate back to options page
    private void navigateToOptionsPage() {
        Intent intent = new Intent(TeamActivity.this, OptionsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Optional: Clear the back stack
        startActivity(intent);
        finish(); // Optional: Call finish() to close the current activity
    }
}


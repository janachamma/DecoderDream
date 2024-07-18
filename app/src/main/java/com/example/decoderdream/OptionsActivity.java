package com.example.decoderdream;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);

        // Set up click listeners for profile and team items
        setupProfileClickListener();
        setupTeamClickListener();

        // Handle navigation back to main screen
        ImageView homeButton = findViewById(R.id.imageView122);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMainScreen();
            }
        });


    }

    // Method to set up click listener for profile item
    private void setupProfileClickListener() {
        @SuppressLint("WrongViewCast") CardView profileCard = findViewById(R.id.options_textview_profile);
        profileCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToProfilePage();
            }
        });
    }

    // Method to set up click listener for team item
    private void setupTeamClickListener() {
        @SuppressLint("WrongViewCast") CardView teamCard = findViewById(R.id.options_textView_team);
        teamCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToTeamPage();
            }
        });
    }

    // Method to navigate to profile page
    private void navigateToProfilePage() {
        Intent intent = new Intent(OptionsActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    // Method to navigate to team page
    private void navigateToTeamPage() {
        Intent intent = new Intent(OptionsActivity.this, TeamActivity.class);
        startActivity(intent);
    }

    // Method to navigate back to main screen
    private void navigateToMainScreen() {
        Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Optional: Clear the back stack
        startActivity(intent);
        finish(); // Optional: Call finish() to close the current activity
    }


}

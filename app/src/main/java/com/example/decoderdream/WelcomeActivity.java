package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Find the buttons
       ImageView goToSettings = findViewById(R.id.imageView1256);
       LinearLayout goToMainScreen = findViewById(R.id.goToMainScreen);

        // Set click listeners for navigation
        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, OptionsActivity.class);
                startActivity(intent);
            }
        });

        goToMainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}


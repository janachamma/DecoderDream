package com.example.decoderdream;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomepageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Find the ImageView and TextView for Dream Interpretation
        ImageView dreamInterpretationIcon = findViewById(R.id.options_imageView_profile);
        TextView dreamInterpretationText = findViewById(R.id.options_textview_profile);

        // Find the ImageView and TextView for Journaling
        ImageView journalingIcon = findViewById(R.id.options_imageView_team);
        TextView journalingText = findViewById(R.id.options_textView_team);

        // Set click listeners for navigation to DreamInterpretationActivity
        View.OnClickListener dreamInterpretationClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, DreamInterpretationActivity.class);
                startActivity(intent);
            }
        };

        // Set click listeners for navigation to JournalingActivity
        View.OnClickListener journalingClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this, JournalingActivity.class);
                startActivity(intent);
            }
        };

        // Assign the click listeners to the ImageView and TextView
        dreamInterpretationIcon.setOnClickListener(dreamInterpretationClickListener);
        dreamInterpretationText.setOnClickListener(dreamInterpretationClickListener);
        journalingIcon.setOnClickListener(journalingClickListener);
        journalingText.setOnClickListener(journalingClickListener);
    }
}

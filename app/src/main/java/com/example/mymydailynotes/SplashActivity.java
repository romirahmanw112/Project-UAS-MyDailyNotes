package com.example.mymydailynotes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mymydailynotes.MainActivity;
import com.example.mymydailynotes.R;

public class SplashActivity extends AppCompatActivity {

    // Duration of the splash screen in milliseconds (3000 ms = 3 seconds)
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Use a Handler to delay the transition to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                // Finish the splash activity so that the user can't go back to it
                finish();
            }
        }, SPLASH_DURATION);
    }
}

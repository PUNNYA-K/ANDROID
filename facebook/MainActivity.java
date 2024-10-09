package com.example.facebook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        ImageView profilePicture = findViewById(R.id.profile_picture);
        TextView profileName = findViewById(R.id.profile_name);
        Button addFriendButton = findViewById(R.id.add_friend_button);
        Button messageButton = findViewById(R.id.message_button);

        // Implement functionality here
        addFriendButton.setOnClickListener(v -> {
            // Add friend logic
        });

        messageButton.setOnClickListener(v -> {
            // Message logic
        });
    }
}

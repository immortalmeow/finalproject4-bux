package com.example.bux;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegister;
    TextView tvLoginHere;
    // Add other class variables as needed...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize your UI elements...
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);

        tvLoginHere = findViewById(R.id.tvLoginHere);
        tvLoginHere.setOnClickListener(this);

        // Add other UI element initializations as needed...
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnRegister) {
            // Handle the click event for btnRegister
            // Example: perform registration logic
            registerUser();
        } else if (v.getId() == R.id.tvLoginHere) {
            // Handle the click event for tvLoginHere
            // Example: navigate to the login activity
            navigateToLogin();
        }
        // Add additional else-if blocks for other clickable elements as needed...
    }

    private void registerUser() {
        // Add code to handle user registration
        // Example: make a network request to register the user
        // and handle the response using Retrofit or other methods
    }

    private void navigateToLogin() {
        // Add code to navigate to the login activity
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        // You might also want to finish the current activity to prevent going back to it from the login activity
        finish();
    }


}

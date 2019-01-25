package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

    }

    public void Famous(View view) {
        startActivity(new Intent(HomeScreen.this, LoginActivity.class));
    }

    public void buttonBorder(View view) {
        startActivity(new Intent(HomeScreen.this, LoginBorder.class));
    }
}

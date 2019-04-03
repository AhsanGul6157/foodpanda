package com.example.ahsannaveed.foodpandaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {

    private Toolbar loginToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        loginToolBar = findViewById(R.id.login_toolbar);
        setSupportActionBar(loginToolBar);
        getSupportActionBar().setIcon(R.drawable.cross_out);

    }
}

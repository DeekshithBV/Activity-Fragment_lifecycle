package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Button showButton = findViewById(R.id.secondary_button);
        Log.i("Activity","secondaryActivity onCreate");

        showButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity","secondaryActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity","secondaryActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity","secondaryActivity onRestart");
    }

    @Override
    public void finish() {
        super.finish();
        Log.i("Activity","secondaryActivity finish");
    }

    @Override
    public void recreate() {
        super.recreate();
        Log.i("Activity","secondaryActivity reCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity","secondaryActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity","secondaryActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity","secondaryActivity onDestroy");
    }
}
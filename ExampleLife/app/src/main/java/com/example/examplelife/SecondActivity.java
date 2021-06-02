package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("APSSDC","second Activity Created");

    }

    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","second Activity Created");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","second Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","second Activity Paused");
    }
    protected void onStop() {

        super.onStop();
        Log.i("APSSDC","second Activity stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC"," second Activity restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC"," second Activity Destroyed");
    }
}
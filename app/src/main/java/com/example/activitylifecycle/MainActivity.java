package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        Log.d("activity", "onCreate: ");
        btn.setOnClickListener(v -> {

            Fragment fragment = new FirstFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.framecontainer, fragment).addToBackStack(null).commit();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("activity", "onStart:activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("activity", "onResume:activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("activity", "onPause:activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("activity", "onStop:activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("activity", "onDestroy:activity");
    }
}
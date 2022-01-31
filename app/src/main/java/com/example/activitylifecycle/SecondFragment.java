package com.example.activitylifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SecondFragment extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("fragment", "onCreate:2fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("fragment", "onCreateView:2fragment");
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("fragment", "onAttach:2fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment", "onStart:2fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment", "onResume:2fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment", "onPause:2fragment");
    }
}
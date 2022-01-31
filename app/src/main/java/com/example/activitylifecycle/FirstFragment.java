package com.example.activitylifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {
    Button btnfragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragment", "onCreate:1fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("fragment", "onCreateView:1fragment");
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btnfragment = view.findViewById(R.id.btnfragment);
        btnfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SecondFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.framecontainer, fragment).addToBackStack(null).commit();
            }

        });
        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("fragment", "onAttach:1fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment", "onStart:1fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment", "onResume:1fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment", "onPause:1fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragment", "onStop:1fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("fragment", "onDetach:1fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("fragment", "onDestroy:1fragment");
    }
}
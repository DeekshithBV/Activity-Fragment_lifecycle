package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Activity","Frag 1 onCreateView");
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("Activity","Frag 1 onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Activity","Frag 1 onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Activity","Frag 1 onDestroy");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Activity","Frag 1 onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Activity","Frag 1 onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Activity","Frag 1 onResume");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Activity","Frag 1 onStart");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("Activity","Frag 1 onViewCreated");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Activity","Frag 1 onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Activity","Frag 1 onDestroyView");
    }
}
package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Activity","Frag 2 onCreateView");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("Activity","Frag 2 onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Activity","Frag 2 onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Activity","Frag 2 onDestroy");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Activity","Frag 2 onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Activity","Frag 2 onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Activity","Frag 2 onResume");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Activity","Frag 2 onStart");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("Activity","Frag 2 onViewCreated");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Activity","Frag 2 onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Activity","Frag 2 onDestroyView");
    }
}
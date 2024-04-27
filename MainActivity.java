package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity","mainActivity onCreate");

        Button clickButtonToFragment1, clickButtonToFragment2;
        clickButtonToFragment1 = findViewById(R.id.btn_frag1);
        clickButtonToFragment2 = findViewById(R.id.btn_frag2);

        // initially will load the 2nd fragment without replacing so the flag 0 is set
        loadFragment(new Fragment2(), 0);

        // on button click will replace the previous fragment with the newly added fragment, so the flag 1 is set.
        clickButtonToFragment1.setOnClickListener(view -> {
            loadFragment(new Fragment1(),1);
        });

        clickButtonToFragment2.setOnClickListener(view -> {
            loadFragment(new Fragment2(), 1);
        });
    }

    private void loadFragment(Fragment fragment, int flag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (flag == 0)
            fragmentTransaction.add(R.id.container,fragment);
        else
            fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity","mainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity","mainActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity","mainActivity onRestart");
    }

    @Override
    public void finish() {
        super.finish();
        Log.i("Activity","mainActivity finish");
    }

    @Override
    public void recreate() {
        super.recreate();
        Log.i("Activity","mainActivity reCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity","mainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity","mainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity","mainActivity onDestroy");
    }
}
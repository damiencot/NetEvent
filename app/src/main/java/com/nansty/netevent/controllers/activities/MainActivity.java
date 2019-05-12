package com.nansty.netevent.controllers.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nansty.netevent.R;
import com.nansty.netevent.controllers.fragments.MainFragment;


public class MainActivity extends AppCompatActivity {

    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.configurationAndShowMainFragment();
    }


    private void configurationAndShowMainFragment(){
        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.activity_main_frame_layout);

        if (mainFragment == null){
            mainFragment = new MainFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.activity_main_frame_layout, mainFragment).commit();
        }


    }
}

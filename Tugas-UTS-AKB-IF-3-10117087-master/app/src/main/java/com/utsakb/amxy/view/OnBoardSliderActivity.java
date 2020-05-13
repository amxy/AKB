package com.utsakb.amxy.view;



import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

import com.utsakb.amxy.R;



public class OnBoardSliderActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Add Friend")
                .setContent("add friend's data list")
                .setBackgroundColor(Color.parseColor("#eaa711")) // int background color
                .setDrawable(R.drawable.addx) // int top drawable
                .build());
        addFragment(new Step.Builder().setTitle("Change Friend")
                .setContent("change friend's data list")
                .setBackgroundColor(Color.parseColor("#6a87a4")) // int background color
                .setDrawable(R.drawable.change) // int top drawable
                .build());
        addFragment(new Step.Builder().setTitle("A Friend List")
                .setContent("displays a list of friend's that have been added")
                .setBackgroundColor(Color.parseColor("#ccc1c5")) // int background color
                .setDrawable(R.drawable.listt) // int top drawable
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardSliderActivity.this, SplashScreenActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

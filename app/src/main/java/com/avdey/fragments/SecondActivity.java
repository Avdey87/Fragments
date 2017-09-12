package com.avdey.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

    }
}

package com.iceoton.animateactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.contentContainer, TwoFragment.newInstance())
                .commit();
    }

}

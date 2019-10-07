package com.webappclouds.mynewapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);

        myLayout.addView(myButton);
        setContentView(myLayout);

    }
}

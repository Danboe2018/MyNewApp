package com.webappclouds.mynewapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout myLayout = new RelativeLayout(this);
        Button myButton = new Button(this);


        myLayout.setBackgroundColor(Color.BLUE);
        myButton.setBackgroundColor(Color.GREEN);
        myButton.setText("Click Here");
        myButton.setTextColor(Color.WHITE);

        RelativeLayout.LayoutParams buttonDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        myLayout.addView(myButton,buttonDetails);

        setContentView(myLayout);
    }
}

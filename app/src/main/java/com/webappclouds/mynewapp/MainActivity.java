package com.webappclouds.mynewapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    TextView myText = findViewById(R.id.myText);
                    myText.setText("Button Clicked");
                }
            }
        );

        myButton.setOnLongClickListener(
            new Button.OnLongClickListener(){
                public boolean onLongClick(View v){
                    TextView myText = findViewById(R.id.myText);
                    myText.setText("Long button press");
                    return true;
                }
            }
        );
    }
}

package com.webappclouds.mynewapp;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView myMessage;
    private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMessage = findViewById(R.id.myMessage);
        this.gestureDetector = new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myMessage.setText("SingleTapConfirmed");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myMessage.setText("SingleTapConfirmed");
        return false;
    }
}

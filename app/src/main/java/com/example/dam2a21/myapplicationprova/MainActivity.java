package com.example.dam2a21.myapplicationprova;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String DEBUG_TAG = "Debug_TAG";
    String LOGGIN_TAG = "LOOGGIN_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(LOGGIN_TAG,"On create");
        onPause();
    }


    protected void onPause(View v) {
        super.onPause();
        Log.i(LOGGIN_TAG,"On pause");
    }


    protected void onResume(View v) {
        super.onResume();
        Log.i(LOGGIN_TAG,"On resume");
    }


    protected void onDestroy(View v) {
        super.onDestroy();
        Log.i(LOGGIN_TAG,"On Destroy");
    }


    protected void onStop(View v) {
        super.onStop();
        Log.i(LOGGIN_TAG,"On Stop");
    }


    protected void onStart(View v) {
        super.onStart();
        Log.i(LOGGIN_TAG,"On Start");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        int action = MotionEventCompat.getActionMasked(event);

        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Log.d(DEBUG_TAG,"Action was DOWN");
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Log.d(DEBUG_TAG,"Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP) :
                Log.d(DEBUG_TAG,"Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL) :
                Log.d(DEBUG_TAG,"Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE) :
                Log.d(DEBUG_TAG,"Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default :
                return super.onTouchEvent(event);
        }
    }



}

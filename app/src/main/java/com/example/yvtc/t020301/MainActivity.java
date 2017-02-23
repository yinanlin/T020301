package com.example.yvtc.t020301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Learn","onCreate"); // debug purpose
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Learn","onStart()"); // debug purpose
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Learn","onResume()"); // debug purpose
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Learn","onRestart()"); // debug purpose
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Learn","onStop()"); // debug purpose
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Learn","onDestroy()"); // debug purpose
    }
}

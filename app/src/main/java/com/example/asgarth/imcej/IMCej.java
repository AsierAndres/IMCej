package com.example.asgarth.imcej;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class IMCej extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcej);
    }

    public void openActivityCamera (View v) {
        Log.d( "ASIERDEBUG","Opening activity for menu");
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
}

package com.mta.genseva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    public void open()
    {
        Intent i=new Intent(getApplicationContext(),Dialogue.class);
        startActivity(i);
    }
}

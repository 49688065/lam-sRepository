package com.lam.jni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private MyNdk mJni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJni = new MyNdk();
    }

    public void click(View view) {
        String string = mJni.getString();
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
}

package com.lam.jni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
        Log.i("tag", "要做冲突");
        Toast.makeText(MainActivity.this, "toa要做冲突", Toast.LENGTH_SHORT).show();
        String branch= "在featrue修改了";
    }
}

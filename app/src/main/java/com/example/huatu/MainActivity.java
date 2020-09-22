package com.example.huatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tv_1 = findViewById(R.id.tv_1);

        FrameLayout frameLayout = findViewById(R.id.fl_1);
        frameLayout.addView(new MyView(this));


    }
}
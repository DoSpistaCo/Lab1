package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onClickChangeText(View view) {
        this.tvMain.setText("TextView text has changed!!!");
    }

    public void onClickChangeTextColor(View view) {
        this.tvMain.setTextColor(Color.BLUE);
    }


    //some next commit
}
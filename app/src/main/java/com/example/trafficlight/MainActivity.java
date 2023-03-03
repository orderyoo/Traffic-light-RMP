package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonRed(View view){
        RelativeLayout back = findViewById(R.id.my_layout_id);
        back.setBackgroundColor(getColor(R.color.red));
    }
    public void onButtonYellow(View view){
        RelativeLayout back = findViewById(R.id.my_layout_id);
        back.setBackgroundColor(getColor(R.color.yellow));
    }
    public void onButtonGreen(View view){
        RelativeLayout back = findViewById(R.id.my_layout_id);
        back.setBackgroundColor(getColor(R.color.green));
    }
}
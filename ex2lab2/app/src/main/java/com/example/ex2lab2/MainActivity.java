package com.example.ex2lab2;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // lấy reference đến các radio button
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton redRadioButton = findViewById(R.id.red_radio_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton blueRadioButton = findViewById(R.id.blue_radio_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton yellowRadioButton = findViewById(R.id.yellow_radio_button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioButton grayRadioButton = findViewById(R.id.gray_radio_button);

        // thiết lập sự kiện onClickListener cho từng radio button
        redRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }
        });

        blueRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
        });

        yellowRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
            }
        });

        grayRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.GRAY);
            }
        });
    }
}





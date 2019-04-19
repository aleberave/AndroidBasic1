package com.example.myapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        changeTextColor();
        changeTextAndTextSize();
    }

    private void initView() {
        textView = findViewById(R.id.textView);
    }

    private void changeTextColor() {
        int color = ContextCompat.getColor(getApplicationContext(), R.color.myTextColor);
        textView.setTextColor(color);
    }

    private void changeTextAndTextSize() {
        String text = getString(R.string.weather);
        textView.setText(text);
    }
}

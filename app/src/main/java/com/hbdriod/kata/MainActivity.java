package com.hbdriod.kata;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView);
        textView.setBackgroundColor(Color.GRAY);
        textView.setTextColor(Color.GREEN);
        final EditText editText = (EditText) findViewById(R.id.edit_text);
        Button button = (Button) findViewById(R.id.button);

    }
}

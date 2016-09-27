package com.hbdriod.kata;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.main_layout);
        linearLayout.setBackgroundColor(Color.BLUE);
        EditText editText = (EditText) findViewById(R.id.text_edit);
        editText.setBackgroundColor(Color.WHITE);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setBackgroundColor(Color.WHITE);
    }
}

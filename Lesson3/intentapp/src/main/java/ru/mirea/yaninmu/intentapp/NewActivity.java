package ru.mirea.yaninmu.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView textNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        textNew = findViewById(R.id.textView2);
        String text = (String) getIntent().getSerializableExtra("key");
        textNew.setText(text);
    }
}
package ru.mirea.yaninmy.data_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        runOnUiThreadExample();
        postDelayedExample();
        postExample();
    }

    private void runOnUiThreadExample() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView.setText("Пример использования метода runOnUiThread");
            }
        });
    }

    private void postDelayedExample() {
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Пример использования метода postDelayed");
            }
        }, 3000); // задержка в 3 секунды (3000 миллисекунд)
    }

    private void postExample() {
        textView.post(new Runnable() {
            @Override
            public void run() {
                textView.setText("Пример использования метода post");
            }
        });
    }
}
package ru.mirea.yaninmu.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MultiActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_main);
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MultiActivityMain.this, SecondActivity.class);
        intent.putExtra("key", "MIREA - ЯНИН МАКСИМ ЮРЬЕВИЧ");
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MultiActivityMain", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MultiActivityMain", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MultiActivityMain", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MultiActivityMain", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MultiActivityMain", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MultiActivityMain", "OnDestroy");
    }
}
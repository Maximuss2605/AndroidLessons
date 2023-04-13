package ru.mirea.yaninmu.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView lol = findViewById(R.id.textView2);
            String university = extras.getString(FavoriteBook.KEY);
            lol.setText(String.format("Любимая книга разработчика: %s", university));
        }
    }

    public void BtnNew(View view) {
        Intent data = new Intent();
        EditText myedit = findViewById(R.id.editTextTextMultiLine);
        String text = myedit.getText().toString();
        data.putExtra(FavoriteBook.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}
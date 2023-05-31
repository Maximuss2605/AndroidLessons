package ru.mirea.yaninmy.employeedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = App.getInstance().getDatabase();
        SuperheroDao superheroDao = db.superheroDao();
        Superhero superhero = new Superhero();
        superhero.id = 1;
        superhero.name = "Человек-паук";
        superhero.superpower = "Владеет способностями паука";
        superheroDao.insert(superhero);
        List<Superhero> superHeroes = superheroDao.getAll();
        superhero = superheroDao.getById(1);
        superhero.name = "Веном";
        superheroDao.update(superhero);
        Log.d("База данных", superhero.name + " " + superhero.superpower);
    }
}
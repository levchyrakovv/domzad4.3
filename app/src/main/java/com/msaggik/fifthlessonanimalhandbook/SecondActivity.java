package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Python", "Это язык программирования, который широко используется в интернет-приложениях, разработке программного обеспечения, науке о данных и машинном обучении (ML).",
                R.drawable.python, "Рейтинг: №1"));
        animals.add( new Animal("C", "это универсальный язык программирования, для которого характерны экономичность выражения, современный поток управления и структуры данных, богатый набор операторов",
                R.drawable.c, "Рейтинг: #2"));
        animals.add( new Animal("Java", "Строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems.",
                R.drawable.java, "Рейтинг: #3"));
        animals.add( new Animal("C++", "Язык программирования общего назначения, созданный Бьярне Страуструпом как расширение языка программирования C, или \"C с классами\".",
                R.drawable.cplusplus, "Рейтинг: #4"));
        animals.add( new Animal("JavaScript", "Язык программирования, который используют для написания frontend - и backend-частей сайтов, а также мобильных приложений.",
                R.drawable.javascript, "Рейтинг: #7"));
    }
}
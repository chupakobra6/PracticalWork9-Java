package com.example.practicalwork9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        studentList = createStudentList();

        recyclerAdapter = new RecyclerAdapter(studentList, this);
        recyclerView.setAdapter(recyclerAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Даша Белова", "Также известна как, Каша Быдлова / Даша Три Параши и т.п.", R.drawable.placeholder_image));
        students.add(new Student("Николай Чернявский", "Или же, Чиколай Нернявский - он почти как мудрое древо, но умеет ходить", R.drawable.student2));
        students.add(new Student("Замбирбекович Баясман", "У него много имён, но самое известное.. - Величественный Бог Солнца. Недавно порвал жопу.", R.drawable.student3));
        students.add(new Student("??", "Не знаю, что это за фрик, вообще случайная картинка", R.drawable.student4));
        students.add(new Student("Максим Бордюр", "Он не был монстром, но стал им. Агрессивен и опасен... был... до того как попил сладкой воды", R.drawable.student5));
        students.add(new Student("Кошка Каши", "Она не студент, но пусть будет здесь / блинб почему она не студент", R.drawable.student6));

        return students;
    }
}
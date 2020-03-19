package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> persons = getPersons();
        LinearLayoutManager manager =new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        Adapter adapter = new Adapter(persons);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }

    private List<Person> getPersons() {
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            persons.add(new Person("name" + i, "surname" + i, "" + i*3));
        }
        return persons;
    }

    private class Random {
    }
}

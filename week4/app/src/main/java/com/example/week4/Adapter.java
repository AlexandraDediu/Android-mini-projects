package com.example.week4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private final List<Person> persons;

    public Adapter(List<Person> persons) {
        this.persons=persons;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(parent.getContext(), R.layout.person_item, null);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
    final Person person= persons.get(position);
    holder.nameTextView.setText(person.getName());
    holder.surNameTextView.setText(person.getSurName());
    holder.button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Mr/Mrs" + person.getName() + " number is " +person.getNumber(), Toast.LENGTH_LONG).show();
        }
    });
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}

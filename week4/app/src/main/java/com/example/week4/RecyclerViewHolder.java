package com.example.week4;
import android.view.View;
import androidx.annotation.NonNull;
import android.widget.TextView;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public final TextView nameTextView;
    public final TextView surNameTextView;
    public final Button button;

    public RecyclerViewHolder(@NonNull View itemView){
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name);
        surNameTextView=itemView.findViewById(R.id.surname);
        button=itemView.findViewById(R.id.button);
    }

}

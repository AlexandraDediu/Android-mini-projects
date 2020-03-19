package com.example.week2;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final EditText edit= findViewById(R.id.edit);
        final CheckBox checkBox=findViewById(R.id.checkbox);
        final ImageView image=findViewById(R.id.image);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked=checkBox.isChecked();
                Toast.makeText( MainActivity.this, isChecked ? "Is Chekeeed": "It is not cheeeked", Toast.LENGTH_LONG).show();
                image.setImageResource(R.drawable.icon);
            }
        });
    }
}

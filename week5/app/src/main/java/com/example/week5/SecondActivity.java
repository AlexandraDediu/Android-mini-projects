package com.example.week5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        if(savedInstanceState!=null){
            String text = savedInstanceState.getString("savedString");
            EditText editText=findViewById(R.id.edittext);
            editText.setText(text);
        }
         findViewById(R.id.doneButton).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String editTextEntry=((EditText) findViewById(R.id.edittext)).getText().toString();
                 Intent intent=new Intent();
                 intent.putExtra("result",editTextEntry);
                 setResult(Activity.RESULT_OK, intent);
             }
         });

        if(getIntent().hasExtra("key")){
            String newLabel= getIntent().getStringExtra("key");
            TextView textView=findViewById(R.id.label);
            textView.setText(newLabel);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String editTextEntry=((EditText) findViewById(R.id.edittext)).getText().toString();
        outState.putString("savedString", editTextEntry);
    }
}


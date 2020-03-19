package com.example.week5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent (Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("https://www.google.com"));
                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", "new label");
                startActivityForResult(intent, 10000);
                //finish();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==10000 && resultCode== Activity.RESULT_OK){
            String result=data.getStringExtra("result");
            Button button=findViewById(R.id.button);
            button.setText(result);
        }
    }
}

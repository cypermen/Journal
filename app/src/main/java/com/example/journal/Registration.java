package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        Button parents = findViewById(R.id.button4);
        Button children = findViewById(R.id.button3);
        Button teachers = findViewById(R.id.button5);

        parents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Registration.this,Director.class);
                startActivity(i);
                finish();
            }
        });

        children.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Registration.this,Director.class);
                startActivity(i);
                finish();
            }
        });

        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Registration.this,Director.class);
                startActivity(i);
                finish();
            }
        });
    }

}

package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Director extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.director);
        Button teacher=findViewById(R.id.button7);
        Button student=findViewById(R.id.button8);
        Button reg=findViewById(R.id.button10);

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Director.this,Registration.class);
                startActivity(i);
                finish();
            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Director.this,Registration.class);
                startActivity(i);
                finish();

            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Director.this,Registration.class);
                startActivity(i);
                finish();
            }
        });


    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Director.this,Choose.class);
        startActivity(i);
        finish();
    }
}

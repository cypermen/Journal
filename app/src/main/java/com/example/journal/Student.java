package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Student extends AppCompatActivity {
    ImageButton marks;
    ImageButton diary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);
        marks = (ImageButton)findViewById(R.id.imageButton);
        diary = (ImageButton)findViewById(R.id.imageButton2);
        final Intent marks_ = new Intent(this, Marks.class);
        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(marks_);

            }
        });

        final Intent diary_ = new Intent(this, Diary.class);
        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(diary_);

            }
        });
    }
}

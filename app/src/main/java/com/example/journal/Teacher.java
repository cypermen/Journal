package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.journal.Authorization.Parent_Authorisation;
import com.example.journal.Authorization.Student_Authorisation;

public class Teacher extends AppCompatActivity {
    Button marks;
    Button hw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        marks =(Button)findViewById(R.id.button11);
        hw =(Button)findViewById(R.id.button9);
        final Intent student_authorisation = new Intent(this, MarksTeacher.class);
        final Intent parent_authorisation = new Intent(this,HomeWork.class);
        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(student_authorisation);

            }
        });

        hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(parent_authorisation);

            }
        });
    }

}

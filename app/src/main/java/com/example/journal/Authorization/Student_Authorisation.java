package com.example.journal.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.journal.R;
import com.example.journal.Student;


public class Student_Authorisation extends AppCompatActivity {
    Button student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_authorisation);
        student = (Button)findViewById(R.id.student);
        final Intent student_ = new Intent(this, Student.class);
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    startActivity(student_);
            }
        });
    }

    private void check(String name, String password){
        //if(name == "Андрей Бабич" && password == "123")
        //return  ;
    }
}

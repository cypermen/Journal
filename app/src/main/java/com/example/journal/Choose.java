package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.journal.Authorization.Admin_Authorisation;
import com.example.journal.Authorization.Parent_Authorisation;
import com.example.journal.Authorization.Student_Authorisation;
import com.example.journal.Authorization.Teacher_Authorisation;


public class Choose extends AppCompatActivity {
    Button student;
    Button parent;
    Button teacher;
    Button admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        student =(Button)findViewById(R.id.student);
        parent =(Button)findViewById(R.id.parent);
        teacher =(Button)findViewById(R.id.teacher);
        admin =(Button)findViewById(R.id.admin);
        final Intent student_authorisation = new Intent(this, Student_Authorisation.class);
        final Intent parent_authorisation = new Intent(this, Parent_Authorisation.class);
        final Intent teacher_authorisation = new Intent(this, Teacher_Authorisation.class);
        final Intent admin_authorisation = new Intent(this, Admin_Authorisation.class);
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(student_authorisation);
            }
        });

        parent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(parent_authorisation);
            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(teacher_authorisation);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(admin_authorisation);
            }
        });

    }

    public void init(){

    }
}

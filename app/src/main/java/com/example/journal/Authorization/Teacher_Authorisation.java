package com.example.journal.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.journal.R;
import com.example.journal.Teacher;


public class Teacher_Authorisation extends AppCompatActivity {
    Button teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_authorisation);
        teacher = (Button)findViewById(R.id.teacher);
        final Intent teacher_ = new Intent(this, Teacher.class);
        teacher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check()) {
                    startActivity(teacher_);
                }
            }
        });
    }

    private boolean check(){

        return  true;
    }
}

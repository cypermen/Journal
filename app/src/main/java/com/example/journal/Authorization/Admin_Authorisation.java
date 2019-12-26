package com.example.journal.Authorization;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.journal.Director;
import com.example.journal.R;


public class Admin_Authorisation extends AppCompatActivity {
    Button admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_authorisation);
        admin = (Button)findViewById(R.id.admin);
        final Intent admin_ = new Intent(this, Director.class);
        admin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    startActivity(admin_);

            }
        });
    }

    private boolean check(){

        return  true;
    }
}

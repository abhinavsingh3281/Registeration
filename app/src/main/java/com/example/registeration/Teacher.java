package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teacher extends AppCompatActivity {
    private Button btnpreviousmenuteacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);


        btnpreviousmenuteacher=findViewById(R.id.btnpreviousmenuteacher);
        btnpreviousmenuteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teacher.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

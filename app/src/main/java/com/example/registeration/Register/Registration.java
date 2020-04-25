package com.example.registeration.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.registeration.R;

public class Registration extends AppCompatActivity {
    private Button btnregisterstudent;
    private Button btnregisterteacher;
    private Button btnregisteradministrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        btnregisterstudent=findViewById(R.id.btnregisterstudent);
        btnregisterteacher=findViewById(R.id.btnregisterteacher);
        btnregisteradministrator=findViewById(R.id.btnregisteradministrator);


        btnregisterstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration.this,RegistrationStudent.class);
                startActivity(intent);
            }
        });


        btnregisterteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration.this,RegisterationTeacher.class);
                startActivity(intent);
            }
        });

        btnregisteradministrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration.this,AdminNext.class);
                startActivity(intent);
            }
        });
    }
}

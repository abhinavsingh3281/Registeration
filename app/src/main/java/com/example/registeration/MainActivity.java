package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.registeration.Register.Registration;

public class MainActivity extends AppCompatActivity {
    private Button btnloginstudent;
    private Button btnloginteacher;
    private Button btnloginadministrator;
    private Button btnregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnloginstudent=findViewById(R.id.btnloginstudent);
        btnloginteacher=findViewById(R.id.btnloginteacher);
        btnloginadministrator=findViewById(R.id.btnloginadministrator);
        btnregister=findViewById(R.id.btnregister);



        btnloginstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StudentLogin.class);
                startActivity(intent);
            }
        });

                btnloginteacher.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent intent1=new Intent(MainActivity.this,Teacher.class);
                       startActivity(intent1);


            }
        });

                btnloginadministrator.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Administrator.class);
                        startActivity(intent);
                    }
                });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.registeration.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.registeration.MainActivity;
import com.example.registeration.R;

public class RegisterationTeacher extends AppCompatActivity {
    private EditText etteachername;
    private EditText etteacherpassword;
    private EditText etteachermobilenumber;
    private EditText etteacheremail;
    private Button btnregisterteacher;
    private Button btnMainMenu;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration_teacher);

       etteachername=findViewById(R.id.etteachername);
        etteacherpassword=findViewById(R.id.etteacherpassword);
        etteachermobilenumber=findViewById(R.id.etteachermobilenumber);
        etteacheremail=findViewById(R.id.etteacheremail);
        btnregisterteacher=findViewById(R.id.btnregisterteacher);
        btnMainMenu=findViewById(R.id.btnMainMenu);


        btnregisterteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Insert database access

            }
        });




        btnMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterationTeacher.this, MainActivity.class);
                startActivity(intent);
            }
        });





    }
}

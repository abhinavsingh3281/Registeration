package com.example.registeration.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.registeration.MainActivity;
import com.example.registeration.R;

public class AdminRegister extends AppCompatActivity {
    private EditText etadminname;
    private EditText etadminpassword;
    private EditText etadminmobilenumber;
    private EditText etadminemail;
    private Button btnregisterAdmin;
    private Button btnMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_register);

        etadminname=findViewById(R.id.etadminname);
        etadminpassword=findViewById(R.id.etadminpassword);
        etadminmobilenumber=findViewById(R.id.etadminmobilenumber);
        etadminemail=findViewById(R.id.etadminemail);
        btnregisterAdmin=findViewById(R.id.btnregisterAdmin);
        btnMainMenu=findViewById(R.id.btnMainMenu);



        btnregisterAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DATABASE OF ADMIN
            }
        });

        btnMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminRegister.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

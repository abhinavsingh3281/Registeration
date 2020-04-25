package com.example.registeration.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.registeration.R;

public class AdminNext extends AppCompatActivity {
    private EditText etusername;
    private EditText etUserPassword;

    private Button btnenteradmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_next);


        etusername = findViewById(R.id.etusername);
        etUserPassword = findViewById(R.id.etUserPassword);

        btnenteradmin=findViewById(R.id.btnenteradmin);

        btnenteradmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(etusername.getText().toString(),etUserPassword.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword) {


        if (userName.equals("admin") && userPassword.equals("1234")){

            Toast.makeText(AdminNext.this, "Login Successful", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(AdminNext.this,AdminRegister.class);
            startActivity(intent);
        } else {

            Toast.makeText(AdminNext.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}

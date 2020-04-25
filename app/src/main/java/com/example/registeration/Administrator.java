package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Administrator extends AppCompatActivity {
    private Button btnpreviousmenuadministrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        btnpreviousmenuadministrator=findViewById(R.id.btnpreviousmenuadministrator);


        btnpreviousmenuadministrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Administrator.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

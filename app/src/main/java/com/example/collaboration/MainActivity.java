package com.example.collaboration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    Button btnMasuk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnMasuk = (Button) findViewById(R.id.btnMasuk);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();
                if (username.equalsIgnoreCase("inas") &&
                        password.equalsIgnoreCase("inas")){
                    Intent pindah = new Intent(MainActivity.this, inas.class);
                    startActivity(pindah);
                } else if (username.equalsIgnoreCase("calista") &&
                        password.equalsIgnoreCase("calista")){
                    Intent pindah = new Intent(MainActivity.this, rusdy.class);
                    startActivity(pindah);
                } else {
                    Toast.makeText(getApplicationContext(), "DATA TIDAK VALID", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
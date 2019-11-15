package com.muskan.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etUname, etPassword;
    private Button btLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        etUname = findViewById(R.id.etUname);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, password;
                name = etUname.getText().toString();
                password = etPassword.getText().toString();
                if ((name.equals("muskan") && password.equals("khadka"))) {
                    Toast.makeText(LoginActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, DashBoard.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}

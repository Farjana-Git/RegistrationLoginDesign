package com.example.hp.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText emailEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        emailEditText = (EditText) findViewById(R.id.emailId);
        passwordEditText = (EditText) findViewById(R.id.passwordId);
        loginButton = (Button) findViewById(R.id.LoginButtonId);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if(email.equals("a@domain.com") && password.equals("1234") )
                {
                    Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                    startActivity(intent);
                }
                else{

                }

            }
        });
    }
}

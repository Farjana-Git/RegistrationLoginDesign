package com.example.hp.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    private Button registrationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernameEditText = (EditText) findViewById(R.id.usernameId);
        emailEditText = (EditText) findViewById(R.id.emailId);
        passwordEditText = (EditText) findViewById(R.id.passwordId);
        confirmPasswordEditText = (EditText) findViewById(R.id.confirm_passwordId);
        registrationButton = (Button) findViewById(R.id.RegistrationButtonId);

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if(username.equals("abcd") && email.equals("a@domain.com") && password.equals("1234") && confirmPassword.equals("1234"))
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else{

                }

            }
        });
    }
}

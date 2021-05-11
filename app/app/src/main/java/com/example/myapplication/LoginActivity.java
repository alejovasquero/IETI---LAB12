package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }


    public void login(View view){
         EditText userText = (EditText) findViewById(R.id.loginUserName);
         EditText passwordText = (EditText) findViewById(R.id.loginPassword);
         String username = userText.getText().toString();
         String password = passwordText.getText().toString();
         System.out.println(username);
         System.out.println(password);
         if( password.length() == 0){
             userText.setError("Las contraseña no puede ser vacía >:v");
         }

        if(username.length() ==0){
            userText.setError("El nombre de usuario no puede ser vacío >:v");
        }
    }
}

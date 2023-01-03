package com.example.newslettera3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {

    TextInputLayout editTextEmail, editTextPassword,editTextFullname;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextFullname = findViewById(R.id.fullname);

        //onclick listener for btn
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname,email,password;
                fullname = String.valueOf(editTextFullname.getEditText());
                email = String.valueOf(editTextEmail.getEditText());
                password = String.valueOf(editTextPassword.getEditText());

                if(TextUtils.isEmpty(fullname)){
                    Toast.makeText(Register.this,"Enter your full name",Toast.LENGTH_SHORT).show();;
                    return ;
                }
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Register.this,"Enter your email",Toast.LENGTH_SHORT).show();;
                    return ;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Register.this,"Enter your password",Toast.LENGTH_SHORT).show();;
                    return ;
                }
            }

            //create user from fb
            //https://firebase.google.com/docs/auth/android/password-auth


        });

    }
}
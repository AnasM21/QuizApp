package com.mohammadi.quizapp;


import android.content.Intent;
/*import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;*/
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mohammadi.quizapp.Common.Commen;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    //Step 1: Declaration
    EditText etLogin, etPassword;
    Button bLogin;
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Step 2: Recuperation des ids
        etLogin = (EditText) findViewById(R.id.etMail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegister = (TextView) findViewById(R.id.tvRegister);
        //Step 3: Association de listeners
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4: Traitement
                if (etLogin.getText().toString().equals("toto") && etPassword.getText().toString().equals("123")){
                    startActivity(new Intent(Login.this, Quiz1.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),"Login or password incorrect !",Toast.LENGTH_SHORT).show();
                }
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4: Traitement
                startActivity(new Intent(Login.this, Register.class));
            }
        });
    }
}

/*package com.mohammadi.quizapp.Common;

public class Commen {
    public static String login;
    public static String password;
}*/

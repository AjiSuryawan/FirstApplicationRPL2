package com.aji.firstapplicationrpl2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        txtusername=findViewById(R.id.txtusername);
        txtpassword=findViewById(R.id.txtpassword);
        btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtusername.getText().toString().equalsIgnoreCase("ani") ||
                        txtpassword.getText().toString().equalsIgnoreCase("ani")){
                    Toast.makeText(Login.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    editor = pref.edit();
                    editor.putString("userid", txtusername.getText().toString());
                    editor.apply();
                    Intent in=new Intent(Login.this, Kalkulator.class);
                    //bisa melempar nilai
                    in.putExtra("username", txtusername.getText().toString());
                    startActivity(in);
                    finish();
                }
            }
        });

    }



}

package com.aji.firstapplicationrpl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    EditText txtangka1;
    EditText txtangka2;
    Button btnplus;
    Button btnminus;
    Button btnkali;
    Button btnbagi;
    TextView tvhasil;
    TextView tvuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link all variable to layout xml
        //menangkap nilai dari intent
        tvuser = findViewById(R.id.tvuser);
        String username;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            username = "ini kosong";
        } else {
            username = extras.getString("username");
        }
        tvuser.setText(username);

        txtangka1 = findViewById(R.id.txtangka1);
        tvhasil = findViewById(R.id.tvhasil);

        txtangka2 = findViewById(R.id.txtangka2);
        btnplus = findViewById(R.id.btnplus);
        btnplus.setOnClickListener(new View.OnClickListener() {
            //not here
            @Override
            public void onClick(View v) {
                try {
                    //untuk kemunkinan error
                    int angka1 = Integer.parseInt(txtangka1.getText().toString());
                    int angka2 = Integer.parseInt(txtangka2.getText().toString());
                    int hasiltambah = angka1 + angka2;
                    tvhasil.setText(hasiltambah + "");
                } catch (Exception e) {
                    //kalo error ngapain
                    Toast.makeText(Kalkulator.this, "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                }
            }
            //no here
        });


        //not here
    }
}
package com.example.profilsekolahsmpn15tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void sejarah(View view){
        Intent intent=new Intent(MainActivity.this, SejarahActivity.class);
        startActivity(intent);
    }
    public void ekstra(View view){
        Intent intent=new Intent(MainActivity.this, EkstraActivity.class);
        startActivity(intent);
    }
    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }
    public void absensi(View view){
        Intent intent=new Intent(MainActivity.this, AbsensiActivity.class);
        startActivity(intent);
    }
    public void tugas(View view) {
        Intent intent = new Intent(MainActivity.this, TugasActivity.class);
        startActivity(intent);
    }
    }
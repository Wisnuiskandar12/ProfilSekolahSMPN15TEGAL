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
    public void gallery(View view){
        Intent intent=new Intent(MainActivity.this,GalleryActivity.class);
        startActivity(intent);
    }
    public void ekstra(View view){
        Intent intent=new Intent(MainActivity.this, EkstraActivity.class);
        startActivity(intent);
    }
    public void berita(View view){
        Intent intent=new Intent(MainActivity.this, BeritaActivity.class);
        startActivity(intent);
    }
    public void fasilitas(View view){
        Intent intent=new Intent(MainActivity.this,FasilitasActivity.class);
        startActivity(intent);
    }

    public void guru(View view){
        Intent intent=new Intent(MainActivity.this,GuruActivity.class);
        startActivity(intent);
    }

    }
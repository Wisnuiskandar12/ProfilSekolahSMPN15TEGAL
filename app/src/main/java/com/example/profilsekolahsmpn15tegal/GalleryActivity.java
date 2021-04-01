package com.example.profilsekolahsmpn15tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }
    public void album1(View view){
        Intent intent=new Intent(GalleryActivity.this, Album1Activity.class);
        startActivity(intent);
    }
    public void album2(View view){
        Intent intent=new Intent(GalleryActivity.this, Album2Activity.class);
        startActivity(intent);
    }
    public void album3(View view){
        Intent intent=new Intent(GalleryActivity.this, Album3Activity.class);
        startActivity(intent);
    }
    public void album4(View view){
        Intent intent=new Intent(GalleryActivity.this, Album4Activity.class);
        startActivity(intent);
    }
    public void album5(View view){
        Intent intent=new Intent(GalleryActivity.this, Album5Activity.class);
        startActivity(intent);
    }
    public void album6(View view){
        Intent intent=new Intent(GalleryActivity.this, Album6Activity.class);
        startActivity(intent);
    }
    public void album7(View view){
        Intent intent=new Intent(GalleryActivity.this, Album7Activity.class);
        startActivity(intent);
    }
}
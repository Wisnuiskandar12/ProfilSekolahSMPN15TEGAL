package com.example.profilsekolahsmpn15tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class BeritaActivity extends AppCompatActivity {
    //    WebView webviewku;
//    WebSettings websettingsku;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);


        web = findViewById(R.id.webview1);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new Callback());
        web.loadUrl("https://smpn15tegal.sch.id/berita/");
    }
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    //    menu kembali berfungsi
    @Override
    public void onBackPressed(){
        if (web.canGoBack()) {
            web.goBack();
            Toast.makeText(this, "Balik maning nang tampilan awal", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Exiting a webview", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }
    }
}
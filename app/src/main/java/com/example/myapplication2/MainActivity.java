package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = getIntent().getData();
        if (uri != null){
            webView = (WebView) findViewById(R.id.webview);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(""+uri);
            Log.i("ii","OnCreate: " + uri.getHost());
        }
    }
}
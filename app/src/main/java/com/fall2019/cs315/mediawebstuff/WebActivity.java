package com.fall2019.cs315.mediawebstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import java.net.URL;

public class WebActivity extends AppCompatActivity {

    private WebView website;
    private ProgressBar progressbar5;
    public static final String ARG_ITEM_ID = "item_id";

    

    public static final String URL = "";
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String link = getIntent().getStringExtra(URL);
        WebView newWebView = findViewById(R.id.WebWeb);
        newWebView.getSettings().setJavaScriptEnabled(true);
        newWebView.loadUrl(link);

        progressbar5 = (ProgressBar) findViewById(R.id.progressBar5);


        newWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url){
                progressbar5.setVisibility(View.INVISIBLE);
            }
        });


    }}

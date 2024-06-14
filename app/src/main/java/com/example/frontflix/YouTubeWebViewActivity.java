package com.example.frontflix;



import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class YouTubeWebViewActivity extends AppCompatActivity {

    private WebView webView;
    private Button btnCloseTrailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_webview);

        webView = findViewById(R.id.webView);
        btnCloseTrailer = findViewById(R.id.btnCloseTrailer);

        String videoId = getIntent().getStringExtra("video_id");
        String videoUrl = "https://www.youtube.com/embed/" + videoId;

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(videoUrl);

        btnCloseTrailer.setOnClickListener(v -> finish());
    }
}

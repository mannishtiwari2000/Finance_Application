package com.example.finance_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Terms_Condition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms__condition)

        var web:WebView=findViewById(R.id.webview)
        web.webViewClient = WebViewClient()
        web.loadUrl("https://www.geeksforgeeks.org/")
        web.settings.javaScriptEnabled = true
        web.settings.setSupportZoom(true)

    }
}
package com.mrrezki.aplikasisederhana.data.view.activity

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.mrrezki.aplikasisederhana.R
import com.mrrezki.aplikasisederhana.databinding.ActivityDetailArticleBinding

class DetailArticleActivity : AppCompatActivity() {

    private val url by lazy { intent.getStringExtra("url") }

    private val binding: ActivityDetailArticleBinding by lazy {
        ActivityDetailArticleBinding.inflate(
            layoutInflater
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupView()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupView() {
        binding.customToolbar.ivBack.setOnClickListener {
            finish()
        }
        createWebView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun createWebView() {
        val loadUrlString = url.toString()
        binding.webView.webViewClient = WebViewClient()
        binding.webView.apply {
            loadUrl(loadUrlString)
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (binding.webView.canGoBack()) binding.webView.goBack()
        else super.onBackPressed()
    }

    @Suppress("DEPRECATION")
    override fun onStart() {
        super.onStart()
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = resources.getColor(R.color.colorPrimary)

        val view = window.decorView
        view.systemUiVisibility = 0
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @Suppress("DEPRECATION")
    override fun onPause() {
        super.onPause()
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = resources.getColor(R.color.colorLight)

        val view = window.decorView
        view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }

}
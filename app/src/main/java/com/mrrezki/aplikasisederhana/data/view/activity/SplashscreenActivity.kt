package com.mrrezki.aplikasisederhana.data.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mrrezki.aplikasisederhana.databinding.ActivitySplashscreenBinding
import kotlinx.coroutines.*

class SplashscreenActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySplashscreenBinding.inflate(layoutInflater) }
    private val activityScope = CoroutineScope(Dispatchers.Main)
    private val moveToMainActivity: Intent by lazy {
        Intent(
            this@SplashscreenActivity,
            MainActivity::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        activityScope.launch {
            delay(3000)

            startActivity(moveToMainActivity)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }

    @Suppress("DEPRECATION")
    override fun onResume() {
        super.onResume()
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
    }
}
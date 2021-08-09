package com.mrrezki.aplikasisederhana.data.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.mrrezki.aplikasisederhana.R
import com.mrrezki.aplikasisederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val navController = findNavController(R.id.hostFragment)
        binding.navigationView.setupWithNavController(navController)
    }
}
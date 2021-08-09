package com.mrrezki.aplikasisederhana.data.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.mrrezki.aplikasisederhana.R
import com.mrrezki.aplikasisederhana.databinding.FragmentNotifikasiBinding

class NotifikasiFragment : Fragment() {

    private lateinit var binding: FragmentNotifikasiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotifikasiBinding.inflate(inflater, container, false)
        return binding.root
    }

    @Suppress("DEPRECATION")
    override fun onStart() {
        super.onStart()
        val window = requireActivity().window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = requireActivity().resources.getColor(R.color.colorPrimary)

        val view = window.decorView
        view.systemUiVisibility = 0
    }

    @Suppress("DEPRECATION")
    override fun onPause() {
        super.onPause()
        val window = requireActivity().window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = requireActivity().resources.getColor(R.color.colorLight)

        val view = window.decorView
        view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }

}
package com.mrrezki.aplikasisederhana.data.view.fragment.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.mrrezki.aplikasisederhana.R
import com.mrrezki.aplikasisederhana.data.view.adapter.PesananAdapter
import com.mrrezki.aplikasisederhana.databinding.FragmentPesananBinding

class PesananFragment : Fragment() {

    private lateinit var binding: FragmentPesananBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPesananBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() {
        binding.tvLayoutToolbar.tvToolbar.text = "Pesanan"
        val tabTitles = arrayListOf("Riwayat", "Dalam Proses")
        val tabAdapter = PesananAdapter(
            requireActivity().supportFragmentManager,
            requireActivity().lifecycle
        )
        binding.viewPager.adapter = tabAdapter
        TabLayoutMediator(binding.tbLayout, binding.viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
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
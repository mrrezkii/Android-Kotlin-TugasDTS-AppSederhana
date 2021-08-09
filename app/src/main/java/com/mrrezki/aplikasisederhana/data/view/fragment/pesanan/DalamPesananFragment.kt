package com.mrrezki.aplikasisederhana.data.view.fragment.pesanan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrrezki.aplikasisederhana.databinding.FragmentDalamPesananBinding

class DalamPesananFragment : Fragment() {

    private lateinit var binding: FragmentDalamPesananBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDalamPesananBinding.inflate(inflater, container, false)
        return binding.root
    }
}
package com.mrrezki.aplikasisederhana.data.view.fragment.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrrezki.aplikasisederhana.databinding.FragmentAkunBinding

class AkunFragment : Fragment() {

    private lateinit var binding: FragmentAkunBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAkunBinding.inflate(inflater, container, false)
        return binding.root
    }

}
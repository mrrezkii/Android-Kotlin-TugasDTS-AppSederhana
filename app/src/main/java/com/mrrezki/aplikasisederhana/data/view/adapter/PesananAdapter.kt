package com.mrrezki.aplikasisederhana.data.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mrrezki.aplikasisederhana.data.view.fragment.pesanan.DalamPesananFragment
import com.mrrezki.aplikasisederhana.data.view.fragment.pesanan.RiwayatPesananFragment

class PesananAdapter(
    fragmentManager: FragmentManager, lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragments: ArrayList<Fragment> = arrayListOf(
        RiwayatPesananFragment(), DalamPesananFragment(),
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}
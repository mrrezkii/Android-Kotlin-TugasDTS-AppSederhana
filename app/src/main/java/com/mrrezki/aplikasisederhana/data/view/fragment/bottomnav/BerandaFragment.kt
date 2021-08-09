package com.mrrezki.aplikasisederhana.data.view.fragment.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.esdsquad.piknik.data.model.ArticelModel
import com.esdsquad.piknik.data.view.adapter.ArticleAdapter
import com.esdsquad.piknik.data.view.adapter.PopulerAdapter
import com.mrrezki.aplikasisederhana.R
import com.mrrezki.aplikasisederhana.data.view.adapter.ImageSliderAdapter
import com.mrrezki.aplikasisederhana.databinding.FragmentBerandaBinding

class BerandaFragment : Fragment() {

    private lateinit var binding: FragmentBerandaBinding
    private lateinit var adapterArticle: ArticleAdapter
    private lateinit var adapterPopuler: PopulerAdapter

    private var images = intArrayOf(
        R.drawable.iklan,
        R.drawable.iklan_1,
        R.drawable.iklan_2
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBerandaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        setupRecyclerView()
    }

    private fun setupView() {
        val adapter = ImageSliderAdapter(requireContext(), images)
        binding.viewpager.adapter = adapter
        binding.dotsIndicator.setViewPager(binding.viewpager)
    }

    private fun setupRecyclerView() {
        val listAdapter: ArrayList<ArticelModel> = ArrayList()
        listAdapter.add(
            ArticelModel(
                1,
                "PPKM Tahap Dua Kota Bandung Dimulai, Ini Daftar Perubahan Aturannya",
                "https://pict.sindonews.net/dyn/620/pena/news/2021/01/27/701/315478/ppkm-tahap-dua-kota-bandung-dimulai-ini-daftar-perubahan-aturannya-kmx.png"
            )
        )
        listAdapter.add(
            ArticelModel(
                2,
                "Aturan Lengkap PPKM Darurat di Jawa-Bali Selama 3-20 Juli",
                "https://akcdn.detik.net.id/visual/2021/06/23/jokowi_169.jpeg"
            )
        )
        listAdapter.add(
            ArticelModel(
                3,
                "Mengenal apa itu Staycation, Kamu harus coba konsep ini",
                "https://ik.imagekit.io/tvlk/blog/2020/01/Staycation-1-Pixabay.jpg"
            )
        )
        adapterArticle = ArticleAdapter(listAdapter)
        binding.listArtikel.adapter = adapterArticle
    }


}
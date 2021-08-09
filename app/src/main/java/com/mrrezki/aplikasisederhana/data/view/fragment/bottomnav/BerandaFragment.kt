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
import com.mrrezki.aplikasisederhana.data.model.PopulerModel
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
        setupRecyclerViewPopopuler()
        setupRecyclerViewArticle()
    }

    private fun setupView() {
        val adapter = ImageSliderAdapter(requireContext(), images)
        binding.viewpager.adapter = adapter
        binding.dotsIndicator.setViewPager(binding.viewpager)
    }

    private fun setupRecyclerViewPopopuler() {
        val listAdapter: ArrayList<PopulerModel> = ArrayList()
        listAdapter.add(
            PopulerModel(
                1,
                "https://cdn-2.tstatic.net/travel/foto/bank/images/objek-wisata-batu-kuda.jpg",
                "Batu Kuda Manglayang",
                "Cibiru Wetan, Bandung"
            )
        )
        listAdapter.add(
            PopulerModel(
                2,
                "https://tempatwisatadibandung.info/wp-content/uploads/2016/09/Kampung-bamboo-bandung.jpg",
                "Kampung Bamboo",
                "Cimenyan, Bandung"
            )
        )
        listAdapter.add(
            PopulerModel(
                3,
                "https://tempatwisatadibandung.info/wp-content/uploads/2020/09/Citere-Camping-Ground-Situ-Cileunca-Pangalengan-Bandung-Selatan.jpg",
                "Citere Camping Ground",
                "Pangalengan, Bandung"
            )
        )
        listAdapter.add(
            PopulerModel(
                4,
                "https://www.hargatiket.net/wp-content/uploads/2019/11/Pine-Forest-Camp.jpg",
                "Pine Forest\nCamp",
                "Lembang, Bandung"
            )
        )
        listAdapter.add(
            PopulerModel(
                5,
                "https://tempatwisatadibandung.info/wp-content/uploads/2015/03/Kampung-Cai-Ranca-Upas-500x332.jpg",
                "Rancaupas Campground",
                "Rancabali, Bandung"
            )
        )
        listAdapter.add(
            PopulerModel(
                6,
                "https://www.jejakpiknik.com/wp-content/uploads/2018/07/ciwangunindahcamp5-630x380.jpg",
                "Turangga Outdoor Camp",
                "Parongpong, Bandung"
            )
        )

        adapterPopuler = PopulerAdapter(listAdapter)
        binding.listPopuler.adapter = adapterPopuler
    }

    private fun setupRecyclerViewArticle() {
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
package com.esdsquad.piknik.data.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mrrezki.aplikasisederhana.databinding.AdapterListPopulerBinding

class PopulerAdapter(
    var tempat: ArrayList<String>,
    var listener: OnAdapterListener
) : RecyclerView.Adapter<PopulerAdapter.ViewHolder>() {


    interface OnAdapterListener {
        fun onClick(result: ArrayList<String>)
    }

    class ViewHolder(val binding: AdapterListPopulerBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterListPopulerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tempats = tempat[position]
//        holder.binding.tvWisata.text = tempats.nama
//        holder.binding.tvAlamat.text = tempats.alamat
    }

    override fun getItemCount() = tempat.size

    fun setData(data: List<String>) {
        tempat.clear()
        tempat.addAll(data)
        notifyDataSetChanged()
    }

}
package com.esdsquad.piknik.data.view.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mrrezki.aplikasisederhana.data.model.PopulerModel
import com.mrrezki.aplikasisederhana.databinding.AdapterListPopulerBinding

class PopulerAdapter(
    var tempat: ArrayList<PopulerModel>,
) : RecyclerView.Adapter<PopulerAdapter.ViewHolder>() {

    class ViewHolder(val binding: AdapterListPopulerBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterListPopulerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tempats = tempat[position]
        holder.binding.tvWisata.text = tempats.nama
        holder.binding.tvAlamat.text = tempats.alamat
        Glide.with(holder.binding.appCompatImageView2.context)
            .load(tempats.photo)
            .centerCrop()
            .into(holder.binding.appCompatImageView2)
    }

    override fun getItemCount() = tempat.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<PopulerModel>) {
        tempat.clear()
        tempat.addAll(data)
        notifyDataSetChanged()
    }

}
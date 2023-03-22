package com.example.lab_2

import android.content.Context
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getSystemService
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab_2.databinding.RecyclerRowBinding
import com.example.lab_2.fragments.MainFragment

class Adapter(private var parent: MainFragment, private var dataList: List<List<String>>): RecyclerView.Adapter<Adapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(itemBinding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val data = dataList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class Holder(private val itemBinding: RecyclerRowBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bind(data: List<String>){
            with(itemBinding){
                name.text = data[1]
                description.text = data[2]

                Glide.with(root)
                    .load(data[0])
                    .circleCrop()
                    .into(photo)

                root.setOnClickListener(adapterListener(parent, data))
            }
        }
    }
}

class adapterListener(private var parent: MainFragment, private var data: List<String>): View.OnClickListener {
    override fun onClick(p0: View?) {
        parent.navigate(data)
    }
}
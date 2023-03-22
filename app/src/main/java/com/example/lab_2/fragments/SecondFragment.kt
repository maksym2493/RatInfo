package com.example.lab_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.lab_2.R
import com.example.lab_2.databinding.FragmentSecondBinding
import com.example.lab_2.databinding.RecyclerRowBinding

class SecondFragment: Fragment() {
    companion object{
        lateinit var data: List<String>
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding = FragmentSecondBinding.inflate(inflater, container, false)

        with(binding){
            name.text = data[1]
            longDescription.text = data[3]
            shortDescription.text = data[2]

            Glide.with(root)
                .load(data[0])
                .circleCrop()
                .into(photo)
        }

        return binding.root
    }
}
package com.yusufov.myexampleapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.yusufov.myexampleapp.databinding.FragmentSecondBinding

class FragmentSecond : Fragment() {
    lateinit var binding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(inflater)
        binding.BtnKecidTO1.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentSecond_to_fragmentFirst)
        }

        return binding.root

    }


}

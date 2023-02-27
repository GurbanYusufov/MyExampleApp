package com.yusufov.myexampleapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.yusufov.myexampleapp.databinding.FragmentFirstBinding
import com.yusufov.myexampleapp.databinding.FragmentSecondBinding

class FragmentFirst : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        //binding.BtnKecidTo2.setOnClickListener {
           // println("MenimTagim onCreateView: ${findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond)}")
        //}
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


}

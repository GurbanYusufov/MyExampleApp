package com.yusufov.myexampleapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.Button
import com.yusufov.myexampleapp.databinding.FragmentThorBinding

class ThorFragment : Fragment() {
  

    private lateinit var binding: FragmentThorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = TransitionInflater.from(requireContext())
        enterTransition = inflater.inflateTransition(android.R.transition.fade)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentThorBinding.inflate(inflater)

        binding.killButton.setOnClickListener {
            binding.ThorText.text = "Thor Geberdi Beybi"

        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(savedInstanceState!=null){
            val user = savedInstanceState.getString("thor_state")
            binding.ThorText.text = user
            println("AAAAAAAAAAAAAAAAAAA")
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("thor_state",binding.ThorText.text.toString())
        println("callMeBaybe")
    }



}
package com.yusufov.myexampleapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.yusufov.myexampleapp.databinding.ActivityOsirisBinding
import java.util.zip.Inflater

class OsirisActivity : AppCompatActivity() {
    private lateinit var binding : ActivityOsirisBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_osiris)
        binding = ActivityOsirisBinding.inflate(layoutInflater)
        val view = binding.root
        binding.NameAndAge.text="Name And Age"
        binding.btnSual.setOnClickListener{
            val dialog = DialogQuestion()
            dialog.show(supportFragmentManager,"dialog")
        }



        setContentView(view)


    }

    fun setUser(user:Users){
        val userName = user.name
        val userAge = user.age
        binding.NameAndAge.text="Name: $userName\nAge: $userAge"
    }

}


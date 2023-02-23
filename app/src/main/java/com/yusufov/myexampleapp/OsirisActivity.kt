package com.yusufov.myexampleapp

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.yusufov.myexampleapp.databinding.ActivityOsirisBinding
import java.util.zip.Inflater

class OsirisActivity : AppCompatActivity(),DialogQuestion.DialogInterface {
    private lateinit var binding : ActivityOsirisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_osiris)
        binding = ActivityOsirisBinding.inflate(layoutInflater)
        binding.btnSual.setOnClickListener{
            val dialog = DialogQuestion()
            dialog.show(supportFragmentManager,"dialog")
        }
        setContentView(binding.root)
    }



    override fun onDialogButtonPress(data: Users) {
        val userName = data.name
        val userAge = data.age
        "Name: $userName\nAge: $userAge".also { binding.NameAndAge.text = it }
    }

}


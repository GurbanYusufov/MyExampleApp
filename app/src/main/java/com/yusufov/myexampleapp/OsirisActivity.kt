package com.yusufov.myexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusufov.myexampleapp.databinding.ActivityOsirisBinding
import java.util.zip.Inflater

class OsirisActivity : AppCompatActivity() {
    private lateinit var binding : ActivityOsirisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_osiris)
        binding = ActivityOsirisBinding.inflate(layoutInflater)
        val view = binding.root

        binding.btnSual.setOnClickListener{
            val dialog = DialogQuestion()
            dialog.show(supportFragmentManager,"dialog")
        }
        setContentView(view)
    }
}
package com.yusufov.myexampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yusufov.myexampleapp.databinding.ActivityMainBinding
import com.yusufov.myexampleapp.databinding.ActivityYarimIllikBinding

class YarimIllik : AppCompatActivity() {
    private lateinit var binding: ActivityYarimIllikBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYarimIllikBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun ksq3Hesabla(view: View){
        val intent = Intent(this, YarimIllik::class.java)
        startActivity(intent)
    }
    fun ksq4Hesabla(view: View){
        val intent = Intent(this, YarimIllik::class.java)
        startActivity(intent)

    }
    fun ksq5Hesabla(view: View){
        val intent = Intent(this, YarimIllik::class.java)
        startActivity(intent)

    }
    fun ksq6Hesabla(view: View){
        val intent = Intent(this, YarimIllik::class.java)
        startActivity(intent)

    }



}
package com.yusufov.myexampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.yusufov.myexampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




    }

    fun btnYarimIllik(view:View){
        val intent = Intent(this, YarimIllik::class.java)
        startActivity(intent)
    }
    fun btnIlik(view:View){
        val intent = Intent(this, Illik::class.java)
        startActivity(intent)
    }
    fun btnSualSayi(view:View){
        val intent = Intent(this, SualSayinaGore::class.java)
        startActivity(intent)
    }



}
package com.yusufov.myexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = R.layout.activity_bottom_nav
        setContentView(view)
        supportFragmentManager.commit {
            setCustomAnimations(android.R.anim.fade_out,android.R.anim.fade_in)
        }
        var navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomView.background = null
        bottomView.menu.getItem(1).isEnabled = false
        bottomView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.action_homeMenu -> {
                  //  findViewById<BottomNavigationView>(R.id.bottomNavigationView).setBackgroundColor(resources.getValue())
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, KratosFragment()).commit()
                    true
                }
                R.id.action_profile->{

                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, ThorFragment()).commit()

                    true
                }

                else -> false
            }
        }

    }
}
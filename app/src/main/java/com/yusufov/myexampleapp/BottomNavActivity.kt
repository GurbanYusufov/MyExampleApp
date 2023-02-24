package com.yusufov.myexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = R.layout.activity_bottom_nav
        setContentView(view)

        var navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.action_homeMenu -> {
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
package com.example.finance_application

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.finance_application.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        supportActionBar?.hide()
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_Members, R.id.navigation_Finance
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        supportActionBar?.customView
        navView.setupWithNavController(navController)

    }

    override fun onBackPressed() {
        startActivity(Intent(baseContext,MainActivity::class.java))
      Toast.makeText(this,"Can't Go Back......!",Toast.LENGTH_LONG).show()

    }
}
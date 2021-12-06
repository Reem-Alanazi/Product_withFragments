package com.example.product_withfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.product_withfragments.data.Datasource
import com.example.product_withfragments.databinding.ActivityMainBinding
import com.example.product_withfragments.model.ItemAdapter

class MainActivity : AppCompatActivity() {


    private lateinit var navController: NavController
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
     return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
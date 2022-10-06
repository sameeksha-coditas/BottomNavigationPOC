package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.bottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private val mMainNavHostFragment: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(
            R.id.mainNavHost
        ) as NavHostFragment
    }
    private val mMainNavController: NavController by lazy { mMainNavHostFragment.navController }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mMainNavController.navInflater.inflate(R.navigation.nav_graph_main)
    }
}
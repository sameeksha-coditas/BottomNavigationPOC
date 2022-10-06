package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var mBinding: FragmentHomeBinding? = null
    private val navController: NavController by lazy { mMainNavHostFragment.navController }
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val mMainNavHostFragment: NavHostFragment by lazy {
        childFragmentManager.findFragmentById(
            R.id.navHostContainer
        ) as NavHostFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return FragmentHomeBinding.inflate(inflater, container, false).apply {
            mBinding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding?.bottomNav?.setupWithNavController(navController)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.titleFragment,
                R.id.leaderBoardFragment,
                R.id.registerFragment
            )
        )
    }
}
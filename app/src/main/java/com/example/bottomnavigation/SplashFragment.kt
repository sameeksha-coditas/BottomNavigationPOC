package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var mBinding: FragmentSplashBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return FragmentSplashBinding.inflate(inflater, container, false).apply {
            mBinding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding?.btnHome?.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }
    }
}
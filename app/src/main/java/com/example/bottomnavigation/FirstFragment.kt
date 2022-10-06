package com.example.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.databinding.FragmentFirstBinding
import com.example.bottomnavigation.databinding.FragmentSplashBinding


class FirstFragment : Fragment() {
    private var mBinding: FragmentFirstBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return FragmentFirstBinding.inflate(inflater, container, false).apply {
            mBinding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding?.btnNavigateToSplash?.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_splashFragment)
        }
    }
}